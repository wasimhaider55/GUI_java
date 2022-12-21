package pkg16;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Container;
class GUI
{
    JFrame frame;
    Container CON;
    JButton ok,Exit;
    GUI()
    {
     initilazie();   
    }
public void  initilazie()
    {
      frame = new JFrame();
      CON = frame.getContentPane();
      CON.setBackground(Color.green);
      ok = new JButton("OK");
      Exit = new JButton("Exit");
      frame.setLayout(new FlowLayout());
      frame.add(ok);
      frame.add(Exit);
      frame.setVisible(true);
      frame.setSize(400,444);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ok.addMouseListener(new MouseAdapter() 
      {
      public void mouseClicked(MouseEvent me)
      {
          JOptionPane.showMessageDialog(frame, "you have clicked ok button");
      }
      });
      
      Exit.addMouseListener(new MouseAdapter() 
      {
      public void mouseClicked(MouseEvent me)
      {
          JOptionPane.showMessageDialog(frame, "your application will terminate now ");
          System.exit(0);
      }
      });
      frame.addWindowListener(new WindowAdapter()
      {
          public void windowOpened(WindowEvent we)
          {
              JOptionPane.showMessageDialog(frame, "welcome G");
          }
          public void windowClosing(WindowEvent we)
          {
            JOptionPane.showMessageDialog(frame, "good bye");
          }
      });
      frame.addMouseMotionListener(new MouseMotionAdapter()
      {
      public void mouseMoved(MouseEvent me)
      {
         CON.setBackground(Color.blue);
      }
      public void mouseDragged(MouseEvent me )
      {
        CON.setBackground(Color.red);  
      }
      });
      
    } 

    private static class con {

        public con() {
        }
    }
}

public class test {

    
    public static void main(String[] args) 
    {
       GUI G = new GUI(); 
    }
    
}
