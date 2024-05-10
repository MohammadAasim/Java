import javax.swing.*;
import java.awt.*;

public class $2_JButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("JButton");
        JButton b = new JButton("Click");
        b.setBounds(100,100,100,50);
        b.setForeground(Color.BLACK);
        b.setBackground(Color.green);
        f.add(b);
        f.setSize(300,300);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.gray);
        f.setLayout(null);
        f.setVisible(true);
    }
}
