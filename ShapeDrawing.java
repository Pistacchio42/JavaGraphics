import java.awt.*;
import javax.swing.JComponent ;
class ShapeDrawing extends JComponent {
  
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawRect(10,10, 150, 200);
        //g2.drawArc(10, 10, 150, 200, 0, 270);
        g2.drawArc(10, 10, 150, 400, 0, 180);
        g2.drawString("TESTO", 10, 20);

        int x[] = {15, 160, 10};
        int y[] = {15, 10, 210};
        int numPoints = 3;
        g2.drawPolygon(x, y, numPoints);

        regularPolygon(3, 50, 200,200, g2);
    }

    public void regularPolygon(int numberOfSides, int sideLength, int x, int y, Graphics graph){
        assert numberOfSides>3;
        int[] xArray = new int[numberOfSides];
        int[] yArray = new int[numberOfSides];
        xArray[0]=x; yArray[0]=y;
        int degrees= ((numberOfSides-2)*180)/numberOfSides;
        int side =1;
        int totalAngle=0;
        while(side<numberOfSides){
            double newX= Math.cos(totalAngle)*sideLength;
            xArray[side]=xArray[side-1]+(int)newX;
            double newY= Math.sin(totalAngle)*sideLength;
            yArray[side]=yArray[side-1]+(int)newY;

            totalAngle=+degrees;
            side++;
        }
        graph.drawPolygon(xArray, yArray, numberOfSides);
    }
}