import javax.swing.*;
import java.awt.*;

public class Rose{
	public static void main(String[] args) {
		JFrame fenetre = new JFrame("Rose");
		

		GridLayout grid = new GridLayout(3,3);
		fenetre.setLayout(grid);

		fenetre.setSize(500,500);	
		fenetre.setLocation(200,200);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
		
		
		
		JLabel mystral = new JLabel("Mystral");
		mystral.setHorizontalAlignment(JLabel.LEFT);
		mystral.setVerticalAlignment(JLabel.TOP);
		fenetre.add(mystral);

		JLabel tramontane = new JLabel("Tramontane");
		tramontane.setHorizontalAlignment(JLabel.CENTER);
		tramontane.setVerticalAlignment(JLabel.TOP);
		fenetre.add(tramontane);

		JLabel grec = new JLabel("Grec");
		grec.setHorizontalAlignment(JLabel.RIGHT);
		grec.setVerticalAlignment(JLabel.TOP);
		fenetre.add(grec);
		
		JLabel ponant = new JLabel("Ponant");
		ponant.setHorizontalAlignment(JLabel.LEFT);
		ponant.setVerticalAlignment(JLabel.CENTER);
		fenetre.add(ponant);
		
		JLabel vide = new JLabel();
		
		JLabel levant = new JLabel("Levant");
		levant.setHorizontalAlignment(JLabel.RIGHT);
		levant.setVerticalAlignment(JLabel.CENTER);
		fenetre.add(levant);
		
		JLabel libeccio = new JLabel("Libeccio");
		libeccio.setHorizontalAlignment(JLabel.LEFT);
		libeccio.setVerticalAlignment(JLabel.BOTTOM);
		fenetre.add(libeccio);
		
		JLabel marin = new JLabel("Marin");
		marin.setHorizontalAlignment(JLabel.CENTER);
		marin.setVerticalAlignment(JLabel.BOTTOM);
		fenetre.add(marin);

		JLabel sirocco = new JLabel("Sirocco");
		sirocco.setHorizontalAlignment(JLabel.RIGHT);
		sirocco.setVerticalAlignment(JLabel.BOTTOM);
		fenetre.add(sirocco);


	
		fenetre.add(vide);
	

		fenetre.setVisible(true);
	}
}