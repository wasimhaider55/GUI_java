import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
class GUI extends MouseAdapter
{
    JFrame frame;
    JButton ok,Exit;
public void initilazie()
{
 frame = new JFrame("Adapter method"); 
      ok = new JButton("OK");
      Exit = new JButton("EXIT");
      frame.setLayout(new FlowLayout());
      frame.add(ok);
      frame.add(Exit);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,400);
      frame.addMouseMotionListener(this);
      ok.addMouseListener(this);
      Exit.addMouseListener(this);
}
    GUI()
    {
     initilazie();
    }
    public void mouseMoved(MouseEvent me )
    {
        System.out.println("mouse was moved on the frame");
    }
    public void mouseClicked(MouseEvent me)
    {
        if(me.getSource()==ok)
     System.out.println("you have clicked ok button");
        if (me.getSource() == Exit)
            System.exit(0);
    }
}


public class test {

   
    public static void main(String[] args)
    {
        GUI g = new GUI();
             }
    
}
