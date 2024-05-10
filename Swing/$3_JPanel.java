import javax.swing.*;
import java.awt.*;

public class $3_JPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame("JPanel");
        JPanel p = new JPanel();
        p.setBounds(100,50,100,50);
        p.setBackground(Color.orange);
        f.add(p);
        f.setSize(300,300);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
