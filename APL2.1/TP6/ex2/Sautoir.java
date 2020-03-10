package TPDESSIN;


import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.*;


public class Sautoir extends JComponent {
    private Polygon poly;


    int x1 = 80;
    int x2 = 155;
    int x3 = 80;
    int x4 = 5;

    int y1 = 0;
    int y2 =75;
    int y3 = 150;
    int y4 = 75;




    @Override
    protected void paintComponent(Graphics pinceau) {

        Graphics secondPinceau = pinceau.create();

        if (this.isOpaque()) {

            secondPinceau.setColor(this.getBackground());
            secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
        }

        /*Le SABLIER */




        int xPoly[] = { x1,x2,x3,x4};
        int yPoly[] = {y1,y2,y3,y4 };

        poly = new Polygon(xPoly, yPoly, xPoly.length);


        secondPinceau.setColor(Color.CYAN);
        secondPinceau.fillPolygon(poly);
    }

}