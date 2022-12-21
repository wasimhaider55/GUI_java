import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
class GUI extends JFrame implements ActionListener{
    JButton b,b1;
    JTextField tf;
    
    GUI(){
        setTitle("first program");
        setLocation(600,100);
        setSize(300,300);
        setLayout(null);
       b = new JButton("login");
       b1 = new JButton("logout");
       tf = new JTextField(10);
       tf.setBounds(50,80,100,30);
       b.setBounds(50, 100, 70, 30);
       b1.setBounds(130, 100, 70, 30);
       add(b1);
      add(b);
      add(tf);
      b.addActionListener(this);
      b1.addActionListener(this);
 
    }

public void actionPerformed(ActionEvent ae)
{ 
    if (ae.getSource()==b)
 JOptionPane.showMessageDialog(this,"you have click the login button");

 if (ae.getSource()==b1)
 JOptionPane.showMessageDialog(this,"you have click the logout button");
}}
public class JavaApplication95 {

   
    public static void main(String[] args) 
    {
        GUI  ss = new GUI();
         ss.setVisible(true);
       ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
