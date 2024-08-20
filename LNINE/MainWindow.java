package LNINE;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow {

    private JFrame frame;
    private JPanel panel;
    private JTextField field;
    private JLabel label;

    public MainWindow(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("9");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("ASSETS\\Rock_Lee.png");
        frame.setIconImage(icon.getImage());

        panel = new JPanel();
        panel.setLayout( new FlowLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        field = createJTextfield();
        panel.add(field);

        label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD, 25));
        panel.add(label, BorderLayout.CENTER);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public JTextField createJTextfield() {
        JTextField field = new JTextField(10);
        
        field.setFont(new Font("Sans-serif", Font.BOLD, 20));
        field.setForeground(Color.blue);
        field.setBackground(Color.yellow);
        field.setToolTipText("hint text here");
        field.setMargin(new Insets(7, 5, 5, 7));

        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(field.getText());
                label.setText(field.getText());
                field.setText("enter more info");
            }
            
        });

        return field;
    }
}
