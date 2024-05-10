import javax.swing.*;
import java.awt.Color;
public class Main {
    public static void main(String[] args) {
        JFrame f=new JFrame("Panel application");
        JPanel p=new JPanel();
        p.setBounds(40,50,250,200);
        p.setBackground(Color.green);
        JButton b=new JButton("Push Button");
        b.setBounds(20,20,100,150);
        b.setForeground(Color.white);
        b.setBackground(Color.black);
        p.add(b);
        JPanel p1=new JPanel();
        p1.setBounds(80,100,200,200);
        p1.setBackground(Color.red);
        f.add(p);
        f.add(p1);
        f.setSize(600,600);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);
        f.getContentPane().setBackground(new Color(50,160,160));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}