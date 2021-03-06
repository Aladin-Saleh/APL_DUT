<<<<<<< HEAD:APL3.1/TP-Dictionnaire/Screen.java
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
    
    private Map<String,Color> keyColor = new HashMap<>();
    private String[] arrOfStr;
    private int[] rgbColor = new int[3];
    private JList<String> listColor;
    private Set<String> colorData;
    GridLayout gestionnaire = new GridLayout(1,2);

public Screen()
{
    this.setSize(500,200);
    this.setLocation(500, 500);
    this.setTitle("Couleur");

    this.setLayout(gestionnaire);
    JPanel listC = new JPanel();
    JPanel panAfficheColor = new JPanel();
    LectureFichier read = new LectureFichier(keyColor);
        
            colorData = keyColor.keySet();
            String[] colorString = colorData.toArray(new String[colorData.size()]);
            listColor = new JList<String>(colorString);
            
            listColor.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listColor.setLayoutOrientation(JList.VERTICAL);
            listColor.setVisibleRowCount(-1);
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
=======
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
    
    private Map<String,Color> keyColor = new HashMap<>();
    private String[] arrOfStr;
    private int[] rgbColor = new int[3];
    private JList<String> listColor;
    private Set<String> colorData;

public Screen()
{
    this.setSize(500,200);
    this.setLocation(500, 500);
    this.setTitle("Couleur");

    JPanel panAfficheColor = new JPanel();
    LectureFichier read = new LectureFichier(keyColor);
        
            colorData = keyColor.keySet();
            String[] colorString = colorData.toArray(new String[colorData.size()]);
            listColor = new JList<String>(colorString);
            
            listColor.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listColor.setLayoutOrientation(JList.VERTICAL);
            listColor.setVisibleRowCount(-1);
            JScrollPane scroll = new JScrollPane(listColor);  
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 

            scroll.setPreferredSize(new Dimension(250, 50));

            
        


        ListListener listenerColor = new ListListener(listColor,panAfficheColor,keyColor);
        listColor.addMouseListener(listenerColor);

         
        
         
         this.setResizable(false);

        this.add(scroll,BorderLayout.WEST);
        this.add(panAfficheColor,BorderLayout.CENTER);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


       
}



}
>>>>>>> 825a7bb4ade10c6ab218a8689df12edf7e664a8e:APL3.1/TP-Dictionnaire/Exo2/Screen.java
