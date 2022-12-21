import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
class GUI extends JFrame implements ActionListener
{
    JFrame frame;
    JLabel user_name,password;
    JTextField user;
    JPasswordField passwordfield;
    JButton login,forgetten;     
  GUI()
  {
   frame = new JFrame("Facebook ");
       user_name = new JLabel("user_name");
       password = new JLabel("password");
       user = new JTextField(10);
       passwordfield = new JPasswordField(10);
       login = new JButton("login");
       forgetten = new JButton("forgetten");
       frame.setLayout(new FlowLayout());
       frame.add(user_name);
       frame.add(user);
       frame.add(password);
       frame.add(passwordfield);
       frame.add(login);
       frame.add(forgetten);
      frame.setVisible(true);
      frame.setSize(230,180);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      login.addActionListener(this);
      forgetten.addActionListener(this);  
  }
    public void actionPerformed(ActionEvent ep)
    {
        if (ep.getSource()== login)
        JOptionPane.showMessageDialog(frame,"you are login to the facebook");
    if (ep.getSource()== forgetten)
        JOptionPane.showMessageDialog(frame, "your are logout from facebook");
    }

}
public class test {

    
    public static void main(String[] args)
    {
      GUI G = new GUI(); 
    }
    
}
