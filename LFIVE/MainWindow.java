package LFIVE;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class MainWindow {

    private JFrame frame;
    private JPanel panel;

    public MainWindow(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("5");
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15));
        panel.setBackground(Color.pink);

        for (int i=1; i<= 8; i++){
            JButton buro = new JButton("Button "+Integer.toString(i));
            panel.add(buro);
        }
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);

        frame.add(panel, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
