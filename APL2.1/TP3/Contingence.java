import javax.swing.*;
import java.awt.*;
 
public class Contingence {
  public static void main(String[] args) {
    // un objet pour servir de fenetre
    JFrame fenetre = new JFrame("Contingence");
    // on configure la fenetre
    fenetre.setSize(500,300);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    








    JTextField texte = new JTextField("Texte ");
    texte.setHorizontalAlignment(JTextField.CENTER);
    texte.setBackground(Color.gray);
    texte.setForeground(Color.green);
    fenetre.add(texte, BorderLayout.SOUTH);


    JTextArea zonetexte = new JTextArea("zoneTexte ici il y a le zone de texte ");
    zonetexte.setBackground(Color.black);
    zonetexte.setForeground(Color.green);
    
    zonetexte.setLineWrap(true);

    JScrollPane asc= new JScrollPane(zonetexte);

    asc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    fenetre.add(asc);

    fenetre.setVisible(true);




}
}