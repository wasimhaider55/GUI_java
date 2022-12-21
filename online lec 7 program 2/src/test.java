import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.FlowLayout;
class GUI extends JFrame
{
    JButton b1 , b2;
    GUI(){
        Container c = getContentPane();
        setTitle("contantpane");
        setLocation(500,200);
        setSize(350,200);
        setLayout(new FlowLayout());//// flow lay out program it can store button in sequence 
        b1 = new JButton("color me ");
        add(b1);
        b2 = new JButton(" click here ");
        add(b2);
        c.setBackground(Color.gray);
        b1.setForeground(Color.blue);
        b2.setForeground(Color.red);
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

