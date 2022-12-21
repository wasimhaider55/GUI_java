import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JOptionPane;
class GUI  implements ActionListener,MouseMotionListener,MouseListener
        
        
{
    JFrame frame;
    JButton ok,Exit;
    JLabel label;
    int xAxis,yAxis;
    public void initilazie()
    {
      frame = new JFrame();
      ok = new JButton("OK");
      Exit = new JButton("EXIT");
      label = new JLabel("mouse are moving");
      frame.setLayout(new FlowLayout());
      frame.add(ok);
      frame.add(Exit);
      frame.add(label);
      frame.setSize(500, 440);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ok.addActionListener(this);
      Exit.addActionListener(this);
      frame.addMouseMotionListener(this);
      frame.addMouseListener(this);
    }
    GUI()
    {
       initilazie(); 
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==ok)
            JOptionPane.showMessageDialog(frame,"you have cliked ok button");
        if (ae.getSource()== Exit)
            System.exit(0);
        
    }
    public void mouseMoved(MouseEvent me)
    {
        xAxis = me.getX();
        yAxis = me.getY();
       label.setText(xAxis +", "+yAxis);
    }
    public void mouseDragged(MouseEvent me )
    {
        System.out.println("the mouse are dragging on JFrame window");
        
    }

    public void mouseClicked(MouseEvent me)
    {
        JOptionPane.showMessageDialog(frame, "you have clicked " + xAxis +","+ yAxis+" Cordinator");
    }
    public void mousePressed(MouseEvent me) {
    }
    public void mouseReleased(MouseEvent me) {
        
    }
    public void mouseEntered(MouseEvent me) {
        
    }
    public void mouseExited(MouseEvent me) {
        
    }
}
public class test {

    
    public static void main(String[] args)
    {
       new GUI();
    }
    
}
