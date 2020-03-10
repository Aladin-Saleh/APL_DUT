import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.*;
 
public class Dessin extends JComponent {
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
      secondPinceau.setColor(new Color(255,0,255));
      secondPinceau.fillOval((this.getWidth()/2)-((this.getHeight()-20)/2),(this.getHeight()/2)-((this.getHeight()-20)/2),this.getHeight(), this.getHeight());  


  }
}