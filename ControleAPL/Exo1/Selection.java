public class Selection
{

    public static String boucleRecursive(int i,int j,String[] args,String currentBiggestName)
    {
        int ind = j;
        String lePlusGrandNom =currentBiggestName;
        if(ind < i)
        {
            //Action de la boucle ici
            
            System.out.println("incremantation : " + ind);
            if (args[ind].length() > lePlusGrandNom.length()) {
                lePlusGrandNom = args[ind];
            }
            ind++;
            
            
            return boucleRecursive(i,ind,args,lePlusGrandNom);
        }
        else
        {
            System.out.println("fin de la boucle");
            return lePlusGrandNom;
        }
    }
    public static void main(String[] args) {
        
        
        System.out.println(boucleRecursive(args.length,0,args,""));

    }
}