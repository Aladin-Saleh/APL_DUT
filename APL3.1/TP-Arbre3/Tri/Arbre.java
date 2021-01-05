public class Arbre {

    
    public Arbre(int[] valeur){

        Noeud noeud = new Noeud(0);
        Noeud noeud2 = new Noeud(0);


        for(int i = 0; i < valeur.length;i++)
        {
            noeud.inserer(valeur[i],noeud);
            
            noeud2.add(valeur[i]);
        }


       System.out.println(noeud);
       System.out.println("--");
       System.out.println(noeud2);

    }







    
}
