import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Damier {
	

	public static void main(String[] args) {
		  
			if(args.length != 1) {
				
				System.out.println("ERROR :Entrer une valeur ! (entier)");
				System.exit(1);
			}
		
			int size = Integer.parseInt(args[0]);
			boolean on = false;
			
			
		    JFrame fenetre = new JFrame("Damier");
		   
		    fenetre.setSize(500,500);
		    fenetre.setLocation(100, 100);
		    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    fenetre.setVisible(true);
		    
		    
		    
		    GridLayout gstn = new GridLayout(size,size);
		    fenetre.setLayout(gstn);
		    
		    
		    for(int i = 0; i < size;++i) {
		    	if(size%2 == 0) {              //Si la taille est un nombre pair on change la valeur du booleen pour faire un décalage//
		    		on =! on;
		    	}
		    	
		    	 for(int i1 = 0; i1 < size;++i1) {
		    		if(on == true) { 
		    		 JPanel cases = new JPanel();
		    		 cases.setBackground(Color.CYAN);
		    		 fenetre.add(cases,BorderLayout.CENTER);
		    		 
		    		 
		    		}
		    		
		    		if(on == false) {
		    			 JPanel casesB = new JPanel();
			    		 casesB.setBackground(Color.white);
			    		 fenetre.add(casesB,BorderLayout.CENTER);
			    		 
		    		}
		    		
		    		on =!on;
		    	 }
		    	
		    	
		    }
		
		    
		    
		    fenetre.setVisible(true);
		    }


		    
		
}
