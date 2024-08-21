package LTHIRTEEN;

import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Launcher {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                try {
                    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Flat".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                    
                } 
                catch (Exception e) {
                    e.printStackTrace();
                }
                MainWindow main = new MainWindow();
            }
        });
    }
}


