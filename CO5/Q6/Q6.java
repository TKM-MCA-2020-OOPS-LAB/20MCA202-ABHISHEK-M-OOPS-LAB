package JAVA_2;
import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;

public class Q6 extends Applet implements ItemListener
{

    Choice choice;

    int rectX;
    int rectY;
    int rectWidth ;
    int rectHeight;
    String shape;
    int Selection;

    public void init()
    {
        // Create the choice and add some choices
        choice = new Choice();
        choice.addItem("Select the shape");
        choice.addItem("Rectangle");
        choice.addItem("Triangle");
        choice.addItem("Square");
        choice.addItem("Circle");
        add(choice);
        choice.addItemListener(this);
    }

    public void itemStateChanged (ItemEvent e)
    {
        // set new selection index
        Selection = choice.getSelectedIndex();
        repaint();
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        if (Selection == 1)
        {
g.setColor(Color.BLUE);
g.fillRect(70,70,300,200);
            g.drawRect(70,70,300,200);
        }
        if (Selection == 2)
        {
            g.setColor(Color.ORANGE);
            g.drawLine(120, 130, 280, 130);
            g.drawLine(120, 130, 200, 65);
            g.drawLine(200, 65, 280, 130);

        }
        if (Selection == 3)
        {
            g.setColor(Color.cyan);
            g.fillRect(150,150,100,100);
            g.drawRect(150,150,100,100);
        }
        if (Selection ==4)
        {

            g.setColor(Color.red);
            g.fillOval(200,200,190,190);
            g.drawOval(200,200,190,190);
        }
    }
}