package LFOURTEEN;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow {

    private JFrame frame;
    private JPanel panel;
    private JCheckBox checkBox;
    public boolean b = false;

    public MainWindow(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("14");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("ASSETS\\Rock_Lee.png");
        frame.setIconImage(icon.getImage());
        
        panel = new JPanel();
        panel.setLayout( new FlowLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        checkBox = new JCheckBox();
        checkBox.setText("check Box");
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = !b;
                System.out.println(b);
            }
        });
        
        panel.add(checkBox);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
