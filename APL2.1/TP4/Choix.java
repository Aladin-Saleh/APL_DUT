import javax.swing.*;
import java.awt.*;
 
public class Choix {
  public static void main(String[] args) {
    // un objet pour servir de fenetre
    JFrame fenetre = new JFrame("ChoixTP4");
    // on configure la fenetre
    fenetre.setSize(500,300);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ButtonGroup choix = new ButtonGroup();
    JRadioButton serp = new JRadioButton("Serpentard");
    JRadioButton gryff = new JRadioButton("Gryffondor");
    JRadioButton serd = new JRadioButton("Serdaigle");
    JRadioButton pouf = new JRadioButton("Poufsouffle");


    choix.add(serp);
    choix.add(gryff);
    choix.add(serd);
    choix.add(pouf);


    fenetre.setLayout(new GridLayout(4,0));
    fenetre.getContentPane().add(serp);
    fenetre.getContentPane().add(gryff);
    fenetre.getContentPane().add(serd);
    fenetre.getContentPane().add(pouf);
    fenetre.setMinimumSize(new Dimension(110,100));








    




  

    fenetre.setVisible(true);




}
}