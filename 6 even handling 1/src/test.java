import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
class GUI implements ActionListener  
{
    JFrame frame;
    JButton ok,cancel,Exit;
   public GUI()
   {
        initalize();
    }
    public void initalize ()
    {
       frame = new JFrame("Even handling");
       ok = new JButton("OK");
       cancel = new JButton("cancel");
       Exit = new JButton("Exit");
       frame.setLayout(new FlowLayout());
       frame.add(ok);
       frame.add(cancel);
       frame.add(Exit);
       frame.setVisible(true);
       frame.setSize(400, 330);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ok.addActionListener(this);
      cancel.addActionListener(this);
      Exit.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()== ok)
        JOptionPane.showMessageDialog(frame,"you have click the ok button");
        if (ae.getSource()== cancel)
            JOptionPane.showMessageDialog(frame, "you have click the cancel button");
        if (ae.getSource() == Exit)
        {
          int option = JOptionPane.showConfirmDialog(frame,"Do you want really Exit","Exit application",JOptionPane.YES_NO_OPTION);
                  
          if (option == 0)
          System.exit(0);
        
          
        }      
    }    
}
public class test {

   
    public static void main(String[] args) 
    {
       GUI g = new GUI();
    }
    
}
