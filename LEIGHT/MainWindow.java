package LEIGHT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button;

    public MainWindow() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("TEST");
        button= new JButton("UPDATE LABLE");

        frame.setTitle("8");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setBackground(Color.GRAY);
        panel.add(label);

        label.setForeground(Color.WHITE);
        label.setFont(new Font("Impact", Font.BOLD, 35));

        ImageIcon labelIcon=new ImageIcon("ASSETS\\Rock_Lee.png");
        label.setIcon(labelIcon);
        label.setIconTextGap(15);
        //label.setHorizontalTextPosition(SwingConstants.CENTER);
        //label.setVerticalTextPosition(SwingConstants.BOTTOM);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("<html>my cool fucking backstory<br>THERE IT IS</html>");
            }
            
        });

        frame.add(button, BorderLayout.SOUTH);
        frame.add(panel, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
