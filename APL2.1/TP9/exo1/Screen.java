import java.awt.*;
import javax.swing.*;


public class Screen extends JFrame {


public Screen(){
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(600,200);
	this.getContentPane().setBackground(Color.BLACK);


	
	Dessin c = new Dessin();
	this.add(c);

		


	}
}