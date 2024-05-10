import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class $9_Application {
    public static void main(String[] args) {
        JFrame f = new JFrame("JCheckBox");

        JLabel l1 = new JLabel("Pizza House");
        l1.setBounds(110,10,100,10);
        l1.setForeground(Color.black);

        JCheckBox c1 = new JCheckBox("Pizza....100");
        c1.setBounds(100,20,100,30);
        JCheckBox c2 = new JCheckBox("Burger....50");
        c2.setBounds(100,50,100,30);
        JCheckBox c3 = new JCheckBox("Roll....70");
        c3.setBounds(100,80,100,30);

        JLabel l2 = new JLabel();
        l2.setBounds(100,150,150,30);
        l2.setForeground(Color.black);

        JButton b = new JButton("Order");
        b.setBounds(100,110,100,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int amount=0;
                String msg="";
                if(c1.isSelected()){
                    amount+=100;
                }
                if(c2.isSelected()){
                    amount+=50;
                }
                if(c3.isSelected()){
                    amount+=70;
                }
                msg = "Total Amount : "+amount;
                l2.setText(msg);
            }
        });

        f.add(l1);
        f.add(l2);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(b);

        f.setSize(400,300);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
