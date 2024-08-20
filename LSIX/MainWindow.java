package LSIX;
import java.awt.*;
import javax.swing.*;

public class MainWindow {

    private JFrame frame;

    public MainWindow(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("6");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //frame.setSize(500,500);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(0,5,10,5));

        for (int i=0; i<27; i++) {
            JButton b= new JButton("B "+Integer.toString(i));
            panel.add(b);
        }

        frame.add(panel); //added in center
        frame.pack();
        frame.setVisible(true);
    }
}
