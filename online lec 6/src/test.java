import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
class GUI extends JFrame
{
    JButton b1;
    GUI(){
        Container c = getContentPane();
        setTitle("contantpane");
        setLocation(500,200);
        setSize(350,200);
        setLayout(null);
        b1 = new JButton("color me ");
        b1.setBounds(30, 100, 150, 40);
        add(b1);
        c.setBackground(Color.gray);
        b1.setForeground(Color.blue);
    }
}
public class test {

    public static void main(String[] args) 
    {
     GUI  ss = new GUI();
     ss.setVisible(true);
     ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
