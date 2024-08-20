package BASE;

import java.awt.*;
import javax.swing.*;

public class MainWindow {

    private JFrame frame;

    public MainWindow(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("base");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
