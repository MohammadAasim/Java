import javax.swing.*;

public class $8_JCheckBox {
    public static void main(String[] args) {
        JFrame f = new JFrame("JCheckBox");
        JCheckBox c1 = new JCheckBox("Pizza");
        c1.setBounds(100,20,100,30);
        JCheckBox c2 = new JCheckBox("Burgur");
        c2.setBounds(100,50,100,30);
        JCheckBox c3 = new JCheckBox("Roll");
        c3.setBounds(100,80,100,30);

        f.add(c1);
        f.add(c2);
        f.add(c3);

        f.setSize(400,300);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
