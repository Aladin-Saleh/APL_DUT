package TPDESSIN;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;

public class SautoirMain {

    public static void main(String[] args) {
        JFrame fenetre = new JFrame("SAUTOIR");

        GridLayout m = new GridLayout(5,5);
        fenetre.setLayout(m);

        Dimension min = new Dimension(800,800);

        fenetre.setMinimumSize(min);


        fenetre.setSize(800, 800);
        fenetre.setLocation(100, 100);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        for (int i = 0; i < 25;++i) {
            Sautoir p = new Sautoir();


            fenetre.add(p);
        }






        fenetre.setVisible(true);
    }
}
