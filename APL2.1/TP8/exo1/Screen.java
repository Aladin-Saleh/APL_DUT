import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Screen extends JFrame {

	public Screen(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);

		JPanel panneau = new JPanel();
		this.add(panneau);

		JButton c = new JButton("CYAN");
		JButton m = new JButton("MAGENTA");
		JButton j = new JButton("JAUNE");

		panneau.add(c);
		panneau.add(m);
		panneau.add(j);

		/*Colors cy = new Colors();*/
		Fond f = new Fond(panneau);

		c.addActionListener(f);
		m.addActionListener(f);
		j.addActionListener(f);



	}
}