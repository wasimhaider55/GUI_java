import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
class GUI
{
    JFrame frame;
    JButton b1,b2,b3,b4,b5;
    public void initalize()
    {
       frame  = new JFrame("Borderlayout"); 
       b1 = new JButton ("EAST");
       b2 = new JButton ("WEST");
       b3 = new JButton ("NORTH");
       b4 = new JButton ("SOUTH");
       b5 = new JButton ("CENTER");
       frame.setLayout(new BorderLayout(20,10));
       frame.add(b1,BorderLayout.EAST);
       frame.add(b2,BorderLayout.WEST);
       frame.add(b3,BorderLayout.NORTH);
       frame.add(b4,BorderLayout.SOUTH);
       frame.add(b5,BorderLayout.CENTER);
       frame.setSize(500, 400);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
   GUI()
   {
       initalize();
   }
   
   }
public class test {

    
    public static void main(String[] args)
    {
        GUI g = new GUI();
    }
    
}
