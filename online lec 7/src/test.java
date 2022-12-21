import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
class GUI extends JFrame{
    JButton northB,southB,eastB,westB,centerB;
    GUI(){
       Container c = getContentPane();
        setTitle("border layout example");
        setLocation(500,200);
        setSize(300,300);
        setLayout(new BorderLayout());
        northB = new JButton("NORTH");
        southB = new JButton("SOUTH");
        westB = new JButton("west");
        eastB = new JButton("East");
        centerB = new JButton("center");
       c.add(northB,BorderLayout.NORTH);
       c.add(southB, BorderLayout.SOUTH);
       c.add(westB, BorderLayout.WEST );
       c.add(eastB , BorderLayout.EAST);
       c.add(centerB , BorderLayout.CENTER);
    }}
public class test {
    public static void main(String[] args) 
    {
        GUI ss = new GUI();
        ss.setVisible(true);
        ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } }
