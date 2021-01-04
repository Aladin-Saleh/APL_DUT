
public class Arbre {

    private Noeud node;
    public Arbre(int[] valeur){

        Noeud noeud = new Noeud(0);

        for(int i = 0; i < valeur.length;i++)
        {
            noeud.add(valeur[i]);
        }


       System.out.println(noeud);
    }







    
}
