import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
class GUI
{
        JFrame frame ;
        JButton button ;
        JTextField field;
        JLabel label;
    public void inilitize()
    {
 frame = new JFrame("first program");
 button = new JButton("cancel");
 field = new JTextField("enter here");
 label = new JLabel("user name");
 frame.setLayout(new FlowLayout());
 frame.add(label);
 frame.add(field);
 frame.add(button);
 frame.setVisible(true);
 frame.setSize(500, 300);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    GUI()
    {
      inilitize();  
    }
}
public class test {
   
    public static void main(String[] args)
    {
       GUI g = new GUI(); 
    }
    
}
