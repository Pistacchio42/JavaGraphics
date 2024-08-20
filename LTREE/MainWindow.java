package LTREE;
import java.awt.*;
import javax.swing.*;

public class MainWindow {

    private JFrame window;

    public MainWindow(){
        initialize();
    }

    public void initialize(){
        window = new JFrame();
        window.setTitle("3");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(500,500);
        window.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        panel.setBackground(Color.pink);

        Button button = new Button("BUTON");
        panel.add(button);
        Button button2 = new Button("BUTON2");
        panel.add(button2);
        Button button3 = new Button("BUTON3");
        panel.add(button3);
        Button button4 = new Button("BUTON4");
        panel.add(button4);

        panel.setPreferredSize(new Dimension(250,250));

        window.getContentPane().add(new ShapeDrawing());

        window.add(panel,BorderLayout.WEST);
        window.setVisible(true);
    }
}
