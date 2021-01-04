public class TriMain
{


    public static void main(String[] args) {
        
        int[] entier = new int[args.length];
        for(int i = 0; i < args.length;i++)
        {
            entier[i] = Integer.parseInt(args[i]);
        }
        Arbre monArbre = new Arbre(entier);
        

    }
}