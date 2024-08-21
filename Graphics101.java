import javax.swing.*;
import java.awt.*;
import javax.swing.JComponent;


public class Graphics101 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Drawing());
        frame.setVisible(true);
    }
}