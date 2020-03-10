import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Question {
	

	public static void main(String[] args) {
		  
		    JFrame fenetre = new JFrame("ChoixTP4");
		   
		    fenetre.setSize(250,250);
		    fenetre.setLocation(100, 100);
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    fenetre.setVisible(true);
		    
		    
		    
		    JLabel etiquette = new JLabel("Aimez-vous les chiens ?");
		    etiquette.setHorizontalAlignment(JLabel.CENTER);
		    fenetre.add(etiquette, BorderLayout.CENTER);
      		etiquette.setVerticalAlignment(JLabel.BOTTOM);
		    
		    GridLayout gestionnaire = new GridLayout(2,1);
		    fenetre.setLayout(gestionnaire);
		    
		    JPanel panneau = new JPanel();
		    JButton oui = new JButton("Oui");
		    panneau.add(oui);
		    JButton non = new JButton("Non");
		    panneau.add(non);
		    JButton nsp = new JButton("NSPP");
		    panneau.add(nsp);
		    
		
		    
		    fenetre.add(panneau,BorderLayout.CENTER);
		    
		    
		    
		    
		    fenetre.setVisible(true);
		    }


		    
		
}
