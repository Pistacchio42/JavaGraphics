package BASE;

import java.awt.*;
import javax.swing.*;

public class MainWindow {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    public MainWindow(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("base");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("ASSETS\\Rock_Lee.png");
        frame.setIconImage(icon.getImage());
        
        panel = new JPanel();
        panel.setLayout( new FlowLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        
        label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD, 25));

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
