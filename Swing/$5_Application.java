import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class $5_Application {
    public static void main(String[] args) {
        JFrame f = new JFrame("Application");
        JTextField tf = new JTextField();
        tf.setBounds(150,100,100,30);
        tf.setBackground(Color.CYAN);
        tf.setForeground(Color.black);

        JButton b = new JButton("B");
        b.setBounds(170,50,60,30);
        b.setBackground(Color.green);
        b.setForeground(Color.black);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Application Done");
            }
        });

        f.add(tf);
        f.add(b);
        f.setSize(400,300);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
