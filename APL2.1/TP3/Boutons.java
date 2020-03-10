import javax.swing.*;
import java.awt.*;
 
public class Boutons {
  public static void main(String[] args) {
    // un objet pour servir de fenetre
    JFrame fenetre = new JFrame();
    // on configure la fenetre
    fenetre.setSize(500,300);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setVisible(true);




    JButton boutton = new JButton("Boutton 1 ");
    boutton.setHorizontalAlignment(JButton.CENTER);
    fenetre.add(boutton, BorderLayout.CENTER);


     JButton boutton2 = new JButton("Boutton 2 ");
    boutton2.setHorizontalAlignment(JButton.CENTER);
    fenetre.add(boutton2, BorderLayout.SOUTH);

    JButton boutton3 = new JButton("Boutton 3 ");
    boutton3.setHorizontalAlignment(JButton.CENTER);
    fenetre.add(boutton3, BorderLayout.NORTH);

    JButton boutton4 = new JButton("Boutton zlhjtzhertzehrtozherthzlerhtjlzerhtzjlerhtklzehtlzerhtzlerthzlmkrthzklmer4 ");
    boutton4.setHorizontalAlignment(JButton.CENTER);
    fenetre.add(boutton4, BorderLayout.WEST);

    JButton boutton5 = new JButton("Boutton 5 ");
    boutton5.setHorizontalAlignment(JButton.CENTER);
    fenetre.add(boutton5, BorderLayout.EAST);



  }
}