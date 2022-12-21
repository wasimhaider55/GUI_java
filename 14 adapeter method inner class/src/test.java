import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Container;
class GUI implements FocusListener
{
    JFrame frame;
    JButton ok,Exit;
    JTextField txt1,txt2;
    Container con;
    public void initilazie()
    {
        frame = new JFrame();
        con = frame.getContentPane();
        txt1 = new JTextField("this is the first textfield");
        txt2 = new JTextField("this is the second textfield");
        con.setBackground(Color.red);
       ok = new JButton("OK");
       Exit = new JButton("EXIT");
       frame.setLayout(new FlowLayout());
       frame.add(ok);
       frame.add(Exit);
       frame.setVisible(true);
       frame.setSize(250,300);
       frame.add(txt1);
       frame.add(txt2);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.addWindowListener(new Windowclass());
       ok.addMouseListener(new mouseclass());
       Exit.addMouseListener(new mouseclass());
       frame.addMouseMotionListener(new mousemoveclass());
       frame.addFocusListener(this);
       txt1.addFocusListener(this);
       txt2.addFocusListener(this);
    }
    GUI(){
        initilazie();
    }
    private class Windowclass extends WindowAdapter
    {
        public void windowOpened(WindowEvent we)
        {
            JOptionPane.showMessageDialog(frame, "welcome G");
        }
        public void windowClosing(WindowEvent we)
        {
          JOptionPane.showMessageDialog(frame, "good bye");
        }
    }
    private class mouseclass extends MouseAdapter
    {
      public void mouseClicked(MouseEvent me)
      {
        if (me.getSource()== ok)
            JOptionPane.showMessageDialog(frame, "you have the ok button");
        if (me.getSource()==Exit)
            JOptionPane.showMessageDialog(frame, "the programm will terminate now");
            System.exit(0);
      }
    }
    private class mousemoveclass extends MouseMotionAdapter
    {
     public void mouseMoved(MouseEvent me)
     {
       con.setBackground(Color.red);
     }
     public void mouseDragged(MouseEvent me )
     {
         con.setBackground(Color.yellow);
     }
    }
    public void focusGained(FocusEvent fe)
    {
        if (fe.getSource()==txt1)
            txt1.setForeground(Color.red);
          if (fe.getSource()==txt2)
            txt2.setForeground(Color.red);
    } 
   public void focusLost(FocusEvent fe)
    {
        if (fe.getSource()==txt1)
            txt1.setForeground(Color.black);
          if (fe.getSource()==txt2)
            txt2.setForeground(Color.black);
    }
}

public class test {

   
    public static void main(String[] args)
    {
      GUI G = new GUI();  
        
    }
    
}
