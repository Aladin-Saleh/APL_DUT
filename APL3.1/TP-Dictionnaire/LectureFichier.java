import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LectureFichier {
    

String[] arrOfStr;
int[] rgbColor = new int[3];

    public LectureFichier()
    {
        try {
            BufferedReader lecture = new BufferedReader(
                                     new FileReader("rgb.txt"));
            try {
                String ligne;
                while ((ligne = lecture.readLine()) != null) 
                {
                  arrOfStr = new String[2];
                  arrOfStr[1] = ligne.trim();
                  for(int i = 0; i < 3;i++)
                  {
                      arrOfStr = arrOfStr[1].split(i==2?"	":" ",2);
                      arrOfStr[1] = arrOfStr[1].trim();
                      rgbColor[i] = Integer.parseInt(arrOfStr[0].trim());
                  }
                  System.out.println(arrOfStr[1]);
                  
                }
            } catch(IOException e) {
              System.err.println("Erreur de lecture dans rgb.txt !");
            }
            try {
              lecture.close();
            } catch(IOException e) {
              System.err.println("Erreur de fermeture de rgb.txt !");
            }
          } catch(FileNotFoundException e) {
            System.err.println("Erreur d'ouverture de rgb.txt !");
          }
    }


}


































/*
               arrOfStr = new String[2];
                    arrOfStr[1] = ligne;
                    for(int i = 0; i < 3;i++)
                    {
                        arrOfStr = arrOfStr[1].split(i==2?"    ":" ",2);
                        arrOfStr[1] = arrOfStr[1].trim();
                        color[i] = Integer.parseInt(arrOfStr[0]);
                    }
*/