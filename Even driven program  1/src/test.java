import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class  GUI extends JFrame implements ActionListener
{
    JButton Login;
   GUI()
   {
       setTitle("Login Form");
        setLocation(250,200);
        setSize(400,300);
        setLayout(null);
        Login = new JButton("Login");
        Login.setBounds(80,8,100,30);
        Login.addActionListener(this);
        add(Login);
   }

public void actionPerformed(ActionEvent ae)
{
JOptionPane.showMessageDialog(this, "YOu have click the login button");
}
}
public class test {

    
    public static void main(String[] args) 
    {
     GUI G = new GUI();
     G.setVisible(true);
G.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
