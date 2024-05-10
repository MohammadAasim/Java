import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMove extends Frame implements MouseMotionListener {
    MouseMove(){
        addMouseMotionListener(this);
        setSize(500,500);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(new Color(190,150,75));
        g.fillRect(e.getX(),e.getY(),20,20);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String[] args) {
        new MouseMove();
    }
}
