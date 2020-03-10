import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Screen extends JFrame {

	public Screen(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);

		this.getContentPane().setBackground(Color.GREEN);

		Dessin disque = new Dessin();
		this.add(disque);



	}
}