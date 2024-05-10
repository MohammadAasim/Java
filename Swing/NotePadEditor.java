import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotePadEditor implements ActionListener {
    JFrame f;
    JMenuBar mb;
    JMenu file,edit,help;
    JMenuItem New,save,print,cut,copy,paste,selectAll;
    JTextArea ta;
    NotePadEditor(){
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("SelectAll");
        New = new JMenuItem("New");
        save = new JMenuItem("Save");
        print = new JMenuItem("Print");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb=new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        file.add(New);
        file.add(save);
        file.add(print);

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        ta = new JTextArea();
        ta.setBounds(2,2,600,600);
        f = new JFrame("NotePad Editor");
        f.add(mb);
        f.add(ta);
        f.setJMenuBar(mb);
        f.setSize(600,600);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new NotePadEditor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cut){
            ta.cut();
        }
        if(e.getSource()==copy){
            ta.copy();
        }
        if(e.getSource()==paste){
            ta.paste();
        }
        if(e.getSource()==selectAll){
            ta.selectAll();
        }
    }
}
