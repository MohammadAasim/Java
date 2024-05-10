import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swings {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing");
        JLabel l = new JLabel();
        l.setBounds(200,300,150,100);
        l.setForeground(Color.green);
        JButton b = new JButton("Click");
        b.setBounds(200,250,100,50);
        b.setForeground(Color.orange);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("Click Successfully");
            }
        });
        f.add(l);
        f.add(b);
        f.setSize(500,500);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
