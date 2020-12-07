public class boucle
{


    public static int boucleRecursive(int i,int j)
    {
        int ind = j;

        if(ind < i)
        {
            ind++;
            System.out.println("incremantation : " + ind);
            
            return boucleRecursive(i, ind);
        }
        else
        {
            System.out.println("fin de la boucle");
            return ind;
        }
    }



    public static void main(String[] args) {
        
        int boucle = boucleRecursive(25,0);

    }



}