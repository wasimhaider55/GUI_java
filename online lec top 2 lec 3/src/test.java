import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
class GUI extends JFrame{
   GUI()
   { 
   this.setTitle("2D Graphics");
   this.setSize(500, 500);
   this.setLayout(null);
   
   }
  public void paint(Graphics g)
  {
      
      Graphics2D gr = (Graphics2D)g;
     // BasicStrocke bs = new BasicStrocke(10.0f,BasicStrock.);
      gr.drawLine(200, 200, 100, 100);
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
