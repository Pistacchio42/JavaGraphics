package LELEVEN;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainWindow implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JTextField field;
    private JButton button;

    public MainWindow(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("11");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("ASSETS\\Rock_Lee.png");
        frame.setIconImage(icon.getImage());
        
        panel = new JPanel();
        panel.setLayout( new FlowLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        label = new JLabel("Enter info");
        label.setFont(new Font("Arial", Font.BOLD, 12));
        panel.add(label);

        field=new JTextField(20);
        panel.add(field);

        button =new JButton("click me");
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked");
            }
        
        });*/
        button.addActionListener(this); //goes trough the class searching for event
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       System.out.println(field.getText());
    }
}
