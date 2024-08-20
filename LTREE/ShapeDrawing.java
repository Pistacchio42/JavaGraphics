package LTREE;

import java.awt.*;
import javax.swing.JComponent;

class ShapeDrawing extends JComponent {
  
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.drawRect(15, 15, 60, 200);
        g2.fillRect(15, 15, 60, 200);
        
        g2.setColor(Color.ORANGE);
        g2.drawOval(200, 200, 80, 80);
        g2.fillOval(200, 200, 80, 80);
        
    }
}