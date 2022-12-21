import javax.swing.*;
import java.awt.*;
class paint extends JFrame
{
    Font bigfont;  
    String s ;
    paint()
    {
        this.setTitle("paint example");
        this.setLocation(300,200);
        this.setSize(400,300);
        this.setLayout(null);
       bigfont = new Font("Serif",Font.BOLD,40);
       s = "hellow";
}
 public void paint(Graphics brush)
       {
         super.paint(brush);
         brush.setFont(bigfont);
         brush.drawString("Hellow", 50,100);
         //brush.setColor(Color.red);
       }
}
public class test {

   
    public static void main(String[] args)
    {
     paint ss = new paint();
     ss.setVisible(true);
     ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
