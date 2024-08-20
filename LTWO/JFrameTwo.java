package LTWO;

import javax.swing.JFrame;

public class JFrameTwo {
    
    private JFrame frame;

    public JFrameTwo(){
        initialize();
    }

    public void initialize(){
        frame =new JFrame();
        frame.setTitle("JEIFREIMTU");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
