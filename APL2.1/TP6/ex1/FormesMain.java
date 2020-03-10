import javax.swing.*;
import java.awt.*;


public class FormesMain {

	public static void main(String[] args) {
		JFrame fenetre = new JFrame();
    fenetre.setSize(600, 600);
    fenetre.setLocation(600, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	Formes p = new Formes();



	
	fenetre.add(p);











    fenetre.setVisible(true);
  
	}
}