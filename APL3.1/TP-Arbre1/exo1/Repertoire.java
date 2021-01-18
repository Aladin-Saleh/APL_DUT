import java.io.File;

public class Repertoire
{
    public static void main(String[] args) {

        try{
            File rep = new File("D:\\APL\\APL3.1\\TP-Arbre1\\exo1\\");
            File sousRepertoire;
            System.out.println("Mon repertoire : " +rep.getPath());
            sousRepertoire = rep.listFiles();
            for (File file : sousRepertoire) {
                if(file.isDirectory())
                {
                    System.out.println(file);
                    sousRepertoire = file.listFiles();
                    for (File file2 : sousRepertoire) {
                        if(file2.isDirectory())
                        {
                            System.out.println(file2);
                            sousRepertoire = file2.listFiles();
                        }
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.err.println("Erreur catch");
        }




    }
}


//File[] file = f.listFiles();  
//for (int i = 0; i < file.length; i++) { 
//  System.out.println(file[i].getName()); 
//} 