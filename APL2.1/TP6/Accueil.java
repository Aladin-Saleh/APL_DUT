package EXO3TP6;

import javax.swing.JComponent;
import java.awt.*;

public class Accueil extends JComponent {
    private Image login;


    public Accueil() {
        super();
        login = Toolkit.getDefaultToolkit().getImage("F:\\JAVA\\src\\EXO3TP6\\login.jpg");
    }


    @Override
    protected void paintComponent(Graphics pinceau) {
        Graphics secondPinceau = pinceau.create();
        if (this.isOpaque()) {
            secondPinceau.setColor(this.getBackground());
            secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
        }

        secondPinceau.drawImage(login, 10, 20,this);
    }
}
