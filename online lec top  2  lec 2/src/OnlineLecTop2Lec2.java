import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
class GUI extends JFrame{
    Font  font;
    String s;
    GUI()
    {
       // this.setTitle("Jdemo paint");
       // this.setLocation(300,250);
        this.setSize(800, 800);
       // this.setLayout(null);
       font = new Font("Arial",Font.BOLD,30);
       String s = " hellow";
        
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setFont(font);
        g.setColor(Color.red);
        g.drawString("this is my first graphis apps", 70, 100);
       g.setColor(Color.blue);
       g.setFont(new Font("Arial",Font.ITALIC,50));
       g.setColor(Color.ORANGE);
      g.drawLine(100, 100, 200, 300);
     g.setColor(Color.red);
     g.drawOval(200,200, 200, 300);
      g.setColor(Color.green);
     g.fillOval(250,250,100,150);
      g.setColor(Color.PINK);
     g.drawRect(300, 400, 200, 200);
      g.setColor(Color.MAGENTA);
     g.fillRect(550, 300, 100, 100);
    }
    
    
}
public class OnlineLecTop2Lec2 {

    public static void main(String[] args)
    {
        GUI ss = new GUI();
        ss.setVisible(true);
        ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
