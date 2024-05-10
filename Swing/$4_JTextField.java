import javax.swing.*;
import java.awt.*;

public class $4_JTextField {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTextField");
        JTextField t = new JTextField();
        t.setBounds(150,50,100,30);
        t.setForeground(Color.black);
        t.setBackground(Color.lightGray);
        f.add(t);
        f.setSize(400,400);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.yellow);
        f.setLayout(null);
        f.setVisible(true);
    }
}
