import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Screen extends JFrame {
    
public Screen()
{
    this.setSize(500,200);
    this.setLocation(500, 500);
    this.setTitle("Couleur");
    LectureFichier test = new LectureFichier();
    Map<String,Color> keyColor = new HashMap<>();
    String[] arrOfStr;
    int[] rgbColor = new int[3];
    JList<String> listColor;
   
    Set<String> colorData;
    
    GridLayout gestionnaire = new GridLayout(1,2);
    this.setLayout(gestionnaire);
    

    JPanel listC = new JPanel();
    JPanel panAfficheColor = new JPanel();
    
    


   

    
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
                  //System.out.println(arrOfStr[1]);
                  keyColor.put(arrOfStr[1], new Color(rgbColor[0],rgbColor[1],rgbColor[2]));
                  
                  
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
            colorData = keyColor.keySet();
            String[] colorString = colorData.toArray(new String[colorData.size()]);
            listColor = new JList<String>(colorString);
            
            listColor.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listColor.setLayoutOrientation(JList.VERTICAL);
            listColor.setVisibleRowCount(-1);
            //JScrollPane listScroller = new JScrollPane(listColor);
            //listColor.setPreferredSize(new Dimension(250, 500));
            listC.add(listColor);
           



            panAfficheColor.setBackground(Color.BLACK);
            
            this.add(listC,BorderLayout.WEST);
            this.add(panAfficheColor,BorderLayout.EAST);
        
    
    
    
    
    
    
    
    
    
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while(true)
            {
                System.out.println(listColor.getSelectedValue());
                panAfficheColor.setBackground(keyColor.get(listColor.getSelectedValue()));
                panAfficheColor.repaint();

            }
}



}
