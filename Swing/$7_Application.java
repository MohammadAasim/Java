import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class $7_Application {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTextArea");

        JTextArea ta = new JTextArea();
        ta.setBounds(100, 20, 200, 100);
        ta.setBackground(Color.orange);
        ta.setForeground(Color.black);

        JButton b = new JButton("Count");
        b.setBounds(150,130,100,30);
        b.setBackground(Color.green);

        JLabel l1 = new JLabel();
        l1.setBounds(100,170,200,30);
        l1.setBackground(Color.PINK);

        JLabel l2 = new JLabel();
        l2.setBounds(100,200,200,30);
        l2.setBackground(Color.PINK);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = ta.getText();
                String[] words = text.split("\\s");
                l1.setText("Words : "+words.length);
                l2.setText("Character : "+text.length());
            }
        });

        f.add(ta);
        f.add(l1);
        f.add(l2);
        f.add(b);

        f.setSize(400, 300);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
