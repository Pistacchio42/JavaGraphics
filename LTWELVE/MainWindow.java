package LTWELVE;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;

import javax.swing.*;

public class MainWindow{

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JPasswordField field;
    private JButton button;

    public MainWindow(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("12");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("ASSETS\\Rock_Lee.png");
        frame.setIconImage(icon.getImage());

        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.LEFT);
        layout.setHgap(10);
        layout.setVgap(10);

        frame.setLayout(layout);

        label = new JLabel("enter password");
        field = new JPasswordField(10);
        button= new JButton("confirm");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] pf = field.getPassword();
                String value = new String(pf);
                System.out.println(value);
            }
        });

        field.setText("let me come in");

        field.setEchoChar('●');

        frame.add(label);
        frame.add(button);
        frame.add(field);

        
        frame.setVisible(true);
    }

}
