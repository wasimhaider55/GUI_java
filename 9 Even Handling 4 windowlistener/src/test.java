import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.JOptionPane;
class GUI implements WindowListener
{
    JFrame frame;
    JFrame otherframe;
    
    GUI()
            {
                initilazie();
            }
            public void initilazie ()
            {
               frame = new JFrame("DEPOSIT_ON_CLSOED");
               otherframe = new JFrame("EXIT_ON_CLOSED");
               frame.setVisible(true);
               frame.setSize(200, 200);
               frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               frame.addWindowListener(this);
               
               otherframe.setVisible(true);
               otherframe.setSize(400, 400);
               otherframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            public void windowOpened(WindowEvent we)
            {
                System.out.println("window have opened successfuly");
            }
              public void windowClosing(WindowEvent me)
            {
                System.out.println("window has been closing");

            }
            public void windowClosed(WindowEvent me)
            {
             JOptionPane.showMessageDialog(null,"JFrame window has closed");
            }
            public void windowActivated(WindowEvent me)
            {
             System.out.println("window is activated");
            }
            public void windowDeactivated(WindowEvent me)
            {
              System.out.println(" window is deactivated");
            }
            public void windowIconified(WindowEvent me)
            {
             System.out.println("window is iconified");   
            }
            public void windowDeiconified(WindowEvent me)
            {
            System.out.println("window is deiconified");
   
            }
            
            
}

public class test {

    
    public static void main(String[] args)
    {
      GUI g = new GUI();
    }
    
}
