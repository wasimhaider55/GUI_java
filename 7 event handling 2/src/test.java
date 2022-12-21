import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
class GUI implements MouseListener
{
    JFrame frame;
    JButton click,press,release,enter,Exit;  
    public void initialize()
    {
      frame = new JFrame("Mouse Listener Example");
      click = new JButton("Mouse click");
      press = new JButton("Mouse press");
      release = new JButton("Mouse release");
      enter = new JButton("Mouse enter");
      Exit = new JButton ("Mouse Exit");
      frame.setLayout(new FlowLayout());
      frame.add(click);
      frame.add(press);
      frame.add(release);
      frame.add(enter);
      frame.add(Exit);
      click.addMouseListener(this);
      press.addMouseListener(this);
      release.addMouseListener(this);
      enter.addMouseListener(this);
      Exit.addMouseListener(this);
      frame.setVisible(true);
      frame.setSize(600, 500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public GUI()
    {
        initialize();
    }
    public void mouseClicked(MouseEvent me )
    {
        if (me.getSource()== click)
        JOptionPane.showMessageDialog(frame,"you have clicked the button");
    }
    public void mousePressed(MouseEvent me )
    {
     if (me.getSource()== press)
        JOptionPane.showMessageDialog(frame,"you have pressed the button");   
    }
    public void mouseReleased(MouseEvent me )
    {
        if (me.getSource()== release)
        JOptionPane.showMessageDialog(frame,"you have the released the button");
    }
    public void mouseEntered(MouseEvent me )
    {
        if (me.getSource()== enter)
        JOptionPane.showMessageDialog(frame,"you have entered in the dimention of enter button");
    }
    public void mouseExited(MouseEvent me )
    {
      if (me.getSource()== Exit)
        JOptionPane.showMessageDialog(frame,"you have exited in the dimention button");  
    }
}
public class test {

    
    public static void main(String[] args)
    {
        GUI g = new GUI();
    }
    
}
