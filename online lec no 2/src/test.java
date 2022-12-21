import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class GUI extends JFrame  implements ActionListener{
 JButton login,exit, reset; 
 JLabel user_name;
 JLabel password;
 JTextField user;
 JPasswordField pas;
 GUI(){
     setTitle("facebook");
     setLocation(300,200);
     setSize(500,500);
     setLayout(null);
     user_name = new JLabel("user_name");
     user_name.setBounds(50, 50, 150,30);
     user = new JTextField();
     user.setBounds(210,50,150,30);
     password = new JLabel("password");
     password.setBounds(50,100,150,30);
     pas = new JPasswordField(100);
     pas.setBounds(210,100,150,30);
     login = new JButton("login");
     login.setBounds(80, 150, 100, 30);
      exit = new JButton("Exit");
     exit.setBounds(190, 150, 100, 30);
      reset = new JButton("Reset");
     reset.setBounds(300, 150, 100, 30);
     add(user_name);
     add(user);
     add(password);
     add(pas);
     add(login);
     add(exit);
     add(reset); 
     login.addActionListener(this);
     exit.addActionListener(this);
     reset.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae){
        Object s = ae.getSource();
        if (s==login)
        {
        String n = new String ("Ahmad")  ;
        String p = new String ("123");
        String en = user.getText();
        String ep = new String(pas.getPassword());
        if( n.equals(en) && p.equals(ep))
           JOptionPane.showMessageDialog(this,"User name and Password are correct");  
        else
           JOptionPane.showMessageDialog(this,"Invalid User name or Password ");  
        }
        else if (s== exit)
            System.exit(1);
        else if (s==reset)
        {
            user.setText(" ");
            pas.setText(" ");

        }

 }
}
public class test {

   
    public static void main(String[] args) 
    {
       GUI ss = new GUI();
       ss.setVisible(true);
       ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
