import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
class GUI
{
    JFrame frame;
    JButton ok,Exit;
    GUI()
    {
     initilazie();   
    }
public void  initilazie()
    {
      frame = new JFrame();
      ok = new JButton("OK");
      Exit = new JButton("Exit");
      frame.setLayout(new FlowLayout());
      frame.add(ok);
      frame.add(Exit);
      frame.setVisible(true);
      frame.setSize(400,444);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ok.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent ae)
          {
              JOptionPane.showMessageDialog(frame, "you have click the ok  button");
          }
      });
            Exit.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent ae)
          {
              JOptionPane.showMessageDialog(frame, "your application will terminate now ");
              System.exit(0);
          }
      });
      
      
    }
    
    
}

public class test {

    
    public static void main(String[] args)
    {
     GUI G = new GUI();   
    }
    
}
