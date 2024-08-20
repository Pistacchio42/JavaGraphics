package LSEVEN;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class MainFrame {

    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public MainFrame(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("7");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();

        button = createButton();
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private JButton createButton() {
        JButton button = new JButton("Print");
        button.setFocusable(false);
        ImageIcon icon = new ImageIcon("ASSETS\\pngegg(3).png");
        button.setIcon(icon);
        button.setIconTextGap(15);
        button.setMnemonic(KeyEvent.VK_P);      ///Event from keyboard (ALT+P)
        button.setToolTipText("aid text");      //aid text when hovering
        button.setFont(new Font("Arial", Font.PLAIN, 23));      ///font 
        button.setMargin(new Insets(10,20,30,40));

        boolean clicked=true;

        button.addActionListener(new ActionListener() {         //action listener for button
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("pressed");
            }
            
        });

        button.doClick();                 //virtual click
        button.setEnabled(false);       //disable button

        button.setPreferredSize(new Dimension(200,200));

        return button;
    }
}
