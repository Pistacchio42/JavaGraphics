package LTWO;

import javax.swing.SwingUtilities;

public class JFrameDemo{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                JFrameOne one = new JFrameOne();
                JFrameTwo two = new JFrameTwo();
            }
        });
    }
}