package LTWO;

import javax.swing.JFrame;

public class JFrameOne extends JFrame{

    public JFrameOne(){
        initialize();
    }

    public void initialize(){
        setTitle("JEIFREIMUAN");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}