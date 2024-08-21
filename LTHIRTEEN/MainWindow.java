package LTHIRTEEN;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class MainWindow implements ActionListener{

    private JFrame frame;

    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem create;
    private JMenuItem save;
    private JMenuItem exit;

    public MainWindow(){
        initialize();
    }

    public void initialize(){
        frame = new JFrame();
        frame.setTitle("13");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon("ASSETS\\Rock_Lee.png");
        frame.setIconImage(icon.getImage());
        
        Font f = new Font("sans-serif", Font.PLAIN, 18);

        UIManager.put("Menu.font",f);
        UIManager.put("MenuItem.font",f);
        UIManager.put("CheckBoxMenuItem.font",f);
        UIManager.put("RadioButtonMenuItem.font",f);

        menuBar = new JMenuBar();   //container
        menu = new JMenu("File");         //item in container menuBar
        create = new JMenuItem("New...");
        exit = new JMenuItem("Exit");
        save = new JMenuItem("Save");

        ImageIcon icon2 = new ImageIcon("ASSETS\\pngegg(3).png");
        save.setIcon(icon2);
        save.setIconTextGap(15);

        menu.setMnemonic(KeyEvent.VK_F);
        
        create.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        create.addActionListener(this);
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        save.addActionListener(this);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        exit.addActionListener(this);
        
        menu.add(create);
        menu.add(save);

        menu.add(new JRadioButtonMenuItem("Radio Button"));
        menu.add(new JCheckBoxMenuItem("Check Box"));
        menu.add(new JMenu("Sub Menu"));

        menu.addSeparator();

        menu.add(exit);

        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JMenuItem){
            JMenuItem item = (JMenuItem)e.getSource();
            String text = item.getText();
            System.out.println(text);
        }
    }
}
