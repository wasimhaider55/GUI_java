import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class GUI implements MouseMotionListener
{
    JFrame frame;
    JLabel label;
    int xAxis,yAxis;
   GUI()
   {
     initilazie();  
   }
    public void initilazie()
    {
     frame = new JFrame("mouse MOuse Listener");
     label = new JLabel("Example of mouse motion Listener");
     frame.setLayout(new FlowLayout());
     frame.add(label);
     frame.setVisible(true);
     frame.setSize(500,400);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.addMouseMotionListener(this);
    }
   public void mouseMoved(MouseEvent me)
   {
       label.setText("mouse is moving on JFrame window ");
       System.out.println("mouse is moving");
       xAxis = me.getX();
       yAxis = me.getY();
        label.setText(xAxis+ ","+ yAxis);
   }
   public void mouseDragged(MouseEvent me )
   {
       label.setText("mouse is dragging on JFrame window");
     System.out.println("mouse is dragging");
   }
}
public class test {


    public static void main(String[] args)
    {
       GUI g = new GUI();
    }
    
}
