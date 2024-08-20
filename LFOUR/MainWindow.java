package LFOUR;
import java.awt.BorderLayout;
import javax.swing.*;

public class MainWindow {

    private JFrame frame;

    public MainWindow(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("4");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        //frame.setLayout(new BorderLayout(10,10));
        BorderLayout layout = new BorderLayout();
        layout.setHgap(10);
        layout.setVgap(25);
        frame.setLayout(layout);
        
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
