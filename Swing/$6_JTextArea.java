import javax.swing.*;
import java.awt.*;

public class $6_JTextArea {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTextArea");
        JTextArea ta = new JTextArea();
        ta.setBounds(150,50,100,100);
        ta.setBackground(Color.orange);
        ta.setForeground(Color.black);
        f.add(ta);

        f.setSize(400,300);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
