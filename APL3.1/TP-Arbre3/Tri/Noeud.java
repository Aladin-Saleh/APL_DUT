public class Noeud {

    private int valeurNoeud;
    private int hauteur;
    private Noeud gauche;
    private Noeud droite;


    public Noeud(int val)
    {
        this.valeurNoeud = val;
        this.gauche = null;
        this.droite = null;

    }

    public Noeud(Noeud g,int val,Noeud d)
    {
        this.valeurNoeud = val;
        this.gauche = g;
        this.droite = d;
        hauteur = 1 + Math.max(H(g),H(d));
    }

    public void add(int nvValeur)
    {
            if(this.valeurNoeud > nvValeur )
            {
            //Si la valeur dans le noeud est plus petite que la nouvelle valeur on la place à droite 
                if(this.droite != null)
                {
                 //Si le noeud de gauche n'est pas vide
                    this.droite.add(nvValeur);    
                }
                else
                {
                 
                    this.droite = new Noeud(nvValeur);
                }
            }
            else if(this.valeurNoeud < nvValeur)
            {
            //Si la valeur dans le noeud est plus petite que la nouvelle valeur on la place à gauche 
                if(this.gauche != null)
                {
                 //Si le noeud de gauche n'est pas vide 
                    this.gauche.add(nvValeur);    
                }
                else
                {
                 
                    this.gauche = new Noeud(nvValeur);
                }
            }
    }


    //gauche, racine, droite
    @Override
    public String toString()
    {
        if(this.gauche != null && this.droite != null)
        {
            return this.droite.toString() + " " + this.valeurNoeud + " " + this.gauche.toString();
        }
        else if(this.gauche != null)
        {
            return this.valeurNoeud + " " + this.gauche.toString();
        }
        else if(this.droite != null)
        {
            return this.droite.toString() + " " + this.valeurNoeud;
        }
        else
        {
            return this.valeurNoeud + " ";
        }
    }   
    
    


    public int H(Noeud a)
    {
      return (a == null) ? -1 : a.hauteur;
    }

    public void calculerHauteur(Noeud a)
    {
      a.hauteur = 1 + Math.max(H(a.gauche), H(a.droite));
    }


    public Noeud rotationG(Noeud a)
    {
        Noeud b = a.droite;
        Noeud c = new Noeud(a.gauche, a.valeurNoeud, b.gauche);
        return new Noeud(c, b.valeurNoeud, b.droite);
    }

    public Noeud rotationD(Noeud a)
    {
        Noeud b = a.gauche;
        Noeud c = new Noeud(a.droite, a.valeurNoeud, b.droite);
        return new Noeud(c, b.valeurNoeud, b.gauche);
    }
   
    public int getValeur()
    {
        return this.valeurNoeud;
    }

    public Noeud equilibrer(Noeud a)
    {
        a.hauteur = 1 + Math.max(H(a.gauche), H(a.droite));
        if(H(a.gauche) - H(a.droite) == 2)
        {
            if (H(a.gauche.gauche) < H(a.gauche.droite))
            a.gauche = rotationG(a.gauche);
            return rotationD(a);
        } //else version symétrique
            if (H(a.gauche) - H(a.droite) == -2)
        {
            if (H(a.droite.droite) < H(a.droite.gauche))
            a.droite = rotationD(a.droite);
            return rotationG(a);
        }
            return a;
}

public Noeud inserer(int x, Noeud a)
{
  if (a == null)
    return new Noeud(null, x, null);
  if (x < a.valeurNoeud) 
    a.gauche = inserer(x, a.gauche);
  else if (x > a.valeurNoeud) 
    a.droite = inserer(x, a.droite);
  return equilibrer(a); //seul changement
}


}
