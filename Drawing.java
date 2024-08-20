
import java.awt.*;
import javax.swing.JComponent;

class Drawing extends JComponent {

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.drawRect(100, 150, 60, 200);
        g2.fillRect(100, 150, 60, 200);
        
        g2.setColor(Color.ORANGE);
        g2.drawOval(185, 235, 80, 220);
        g2.fillOval(185, 235, 80, 220);
        
        g.setColor(Color.YELLOW);
        int x[] = {400, 400, 500};
        int y[] = {100, 200, 200};
        int numPoints = 3;
        g.drawPolygon(x, y, numPoints);
        g.fillPolygon(x, y, numPoints);
        regularPolygon(8,200,200,200, g);
    }

    ///NOT WORKING
    public void regularPolygon(int numberOfSides, int sideLength, int x, int y, Graphics graph) {
        assert numberOfSides >= 3;
        int[] xArray = new int[numberOfSides];
        int[] yArray = new int[numberOfSides];
        xArray[0] = x;
        yArray[0] = y;
        double degrees = ((numberOfSides - 2) * 180) / numberOfSides;
        System.out.println(degrees);
        int side = 1;
        System.out.println("C- x:" + xArray[0] + " y:" + yArray[0]);
        double totalAngle = 0;
        while (side < numberOfSides) {
            double newX = Math.cos((totalAngle) * (Math.PI / 180)) * sideLength;
            xArray[side] = xArray[side - 1] + (int) newX;
            double newY = Math.sin((totalAngle) * (Math.PI / 180)) * sideLength;
            yArray[side] = yArray[side - 1] + (int) newY;
            System.out.println("coords: x:" + xArray[side] + " y:" + yArray[side]);
            totalAngle = totalAngle + degrees;
            side++;
        }
        graph.drawPolygon(xArray, yArray, numberOfSides);
        graph.fillPolygon(xArray, yArray, numberOfSides);
    }
}
