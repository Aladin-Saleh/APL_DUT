package EXO3TP6;

import java.awt.*;
import javax.swing.*;

public class AccueilMain {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame();
        fenetre.setLayout(null);
        fenetre.setSize(380,310);
        fenetre.setLocation(0,0);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setContentPane(new Accueil());

        JTextField Login = new JTextField();
        JTextField Password = new JTextField();

        Login.setBackground(Color.WHITE);
        Login.setLocation(110,113);
        Login.setSize(169,25);
        Password.setLocation(110,150);
        Password.setSize(169,25);
        fenetre.add(Password);
        fenetre.add(Login);
        fenetre.setVisible(true);
    }
}