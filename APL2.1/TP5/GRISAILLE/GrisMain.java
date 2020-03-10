import javax.swing.*;
import java.awt.*;


public class GrisMain {
	
	public static void main(String[] args) {
	    JFrame fenetre = new JFrame("ChoixTP4");
	    JPanel back = new JPanel();
    // on configure la fenetre
    fenetre.setSize(500,300);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
Gris c = new Gris(55);

		back.setBackground(c);
		fenetre.add(back);


		fenetre.setVisible(true);
	}
}