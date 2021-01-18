public class Noeud {

    private int valeurNoeud;
    private Noeud gauche;
    private Noeud droite;


    public Noeud(int val)
    {
        this.valeurNoeud = val;
        this.gauche = null;
        this.droite = null;

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
            return this.gauche.toString() + " " + this.valeurNoeud + " " + this.droite.toString();
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

   
    public int getValeur()
    {
        return this.valeurNoeud;
    }


}
