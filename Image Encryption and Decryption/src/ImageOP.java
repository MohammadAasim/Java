import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ImageOP {
    public static  void imageOperation(int k){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
        // file input stream reader
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            int i=0;
            for(byte b:data){
                //System.out.println(b);
                data[i]=(byte)(b^k);
                i++;
            }
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null,"Done");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Image Encryption and Decryption");


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("./image/photo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,800,150);
        f.add(image);

        //Label
        JLabel l1 = new JLabel();
        l1.setText("Image Encryption");
        l1.setBounds(200,150,300,40);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Roboto",Font.BOLD,35));
        f.add(l1);
        // font
        Font  font = new Font("Roboto",Font.BOLD,20);
        JButton button1 = new JButton();
        button1.setBorder(new LineBorder(Color.MAGENTA,3,true));
        button1.setText("Open Image");
        button1.setFont(font);
        button1.setBounds(200,200,150,30);
        button1.setForeground(Color.WHITE);
        button1.setBackground(new Color(142, 68, 173 ));
        f.add(button1);
        // textfield
        JTextField textField1 = new JTextField(10);
        textField1.setBorder(new LineBorder(Color.black,3,true));
        textField1.setBounds(360,200,150,30);
        textField1.setText("10");
        textField1.setFont(font);
        f.setLayout(new FlowLayout());
        f.add(textField1);
        button1.addActionListener(e->{
            String text = textField1.getText();
            int temp = Integer.parseInt(text);
            imageOperation(temp);
        });

        //Label
        JLabel l2 = new JLabel();
        l2.setText("Image Decryption");
        l2.setBounds(200,300,300,40);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Roboto",Font.BOLD,35));
        f.add(l2);

        JButton button2 = new JButton();
        button2.setBorder(new LineBorder(Color.MAGENTA,3,true));
        button2.setText("Open Image");
        button2.setFont(font);
        button2.setBounds(200,350,150,30);
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(142, 68, 173 ));
        f.add(button2);
        // textfield
        //LineBorder lineBorder =new LineBorder(Color.white, 8, true);
        JTextField textField2 = new JTextField(10);
        textField2.setBorder(new LineBorder(Color.black,3,true));
        textField2.setBounds(360,350,150,30);
        textField2.setText("10");
        textField2.setFont(font);
        f.setLayout(new FlowLayout());
        f.add(textField2);

        button2.addActionListener(e->{
            String text = textField2.getText();
            int temp = Integer.parseInt(text);
            imageOperation(temp);
        });

        f.setSize(800,500);
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
