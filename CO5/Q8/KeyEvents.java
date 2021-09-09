package JAVA_2;
import java.awt.*;
import java.awt.event.*;
public class KeyEvents extends Frame implements KeyListener{
    Label l;
    TextArea area;
    KeyEvents(){

        l=new Label();
        l.setBounds(30,60,110,30);
        area=new TextArea();
        area.setBounds(30,90,310, 310);
        area.addKeyListener(this);
        add(l);add(area);
        setSize(300,300);
        setLayout(null)
        setVisible(true);
         }
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }
    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed");
    }

    public static void main(String[] args) {
        new KeyEvents();
    }
}
