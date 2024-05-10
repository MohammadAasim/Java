import javax.swing.*;
import java.awt.*;

public class $1_JFrame {
    public static void main(String[] args) {
        JFrame f = new JFrame("This is my First Frame");
        f.setSize(300,300);
        f.setResizable(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.getContentPane().setBackground(new Color(175, 122, 197 ));
        f.setDefaultLookAndFeelDecorated(true);
        f.setLayout(null);
        f.setVisible(true);
    }
}
