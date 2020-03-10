import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Fond implements ActionListener{

	JPanel panneau;

	public Fond(JPanel p){
		this.panneau = p;
	}


	@Override
	public void actionPerformed(ActionEvent e){
		String bouton = e.getActionCommand();

		if(bouton == "CYAN"){
			panneau.setBackground(Color.CYAN);
		}

		if(bouton == "JAUNE"){
			panneau.setBackground(Color.YELLOW);
		}

		if(bouton == "MAGENTA"){
			panneau.setBackground(new Color(255,0,255));
		}
	}
	




	}