import javax.swing.JComponent;
import java.awt.*;
 
public class Dessin extends JComponent {
  
  private int x = 50;


  @Override
  protected void paintComponent(Graphics pinceau) {

    Graphics secondPinceau = pinceau.create();

    if (this.isOpaque()) {

      secondPinceau.setColor(this.getBackground());
      secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
    }


for(int i = 0; i < 5;i++)
      secondPinceau.setColor(Color.WHITE);
      secondPinceau.fillOval(x,50,this.getHeight()-100,this.getHeight()-100);

      x += 50;
 
  }
}