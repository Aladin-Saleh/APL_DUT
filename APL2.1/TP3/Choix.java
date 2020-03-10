import javax.swing.*;
import java.awt.*;
 
public class Choix {
  public static void main(String[] args) {
    // un objet pour servir de fenetre
    JFrame fenetre = new JFrame("Saisie");
    // on configure la fenetre
    fenetre.setSize(500,300);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ButtonGroup choix = new ButtonGroup();
    JRadioButton serp = new JRadioButton("Serpentar");
    JRadioButton gryff = new JRadioButton("Gryffondor");
    JRadioButton serd = new JRadioButton("Serdaigle");


    choix.add(serp);
    choix.add(gryff);
    choix.add(serd);


    fenetre.add(serp, BorderLayout.NORTH);
    fenetre.add(gryff, BorderLayout.CENTER);
    fenetre.add(serd, BorderLayout.SOUTH);






  

    fenetre.setVisible(true);




}
}