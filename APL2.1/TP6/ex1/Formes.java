import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.*;

 
public class Formes extends JComponent {
  	  private Image Cercle;
 

  public Formes() {
    super();
    Cercle = Toolkit.getDefaultToolkit().getImage("cercles.png");
  }


  @Override
 

  protected void paintComponent(Graphics pinceau) {
    // obligatoire : on crée un nouveau pinceau pour pouvoir le modifier plus tard
    Graphics secondPinceau = pinceau.create();
    // obligatoire : si le composant n'est pas censé être transparent
    if (this.isOpaque()) {
      // obligatoire : on repeint toute la surface avec la couleur de fond
      secondPinceau.setColor(this.getBackground());
      secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
    // maintenant on dessine ce que l'on veut	
    secondPinceau.setColor(Color.blue);
    secondPinceau.drawRect(10,10,50,50);

    /*Le cercle*/
    secondPinceau.setColor(Color.green);
    secondPinceau.fillOval(70,60,50,50);


    /*Le texte*/
    Font font = new Font("o",Font.BOLD,24);
    secondPinceau.setFont(font);
    secondPinceau.setColor(new Color(238,130,238));
    secondPinceau.drawString(">o<",80,50);


 	secondPinceau.drawImage(Cercle, 90, 106, this);


  }



}