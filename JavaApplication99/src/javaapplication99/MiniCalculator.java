
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
 class JFrameWithManyComponents extends JFrame implements ActionListener  {
     char symbol;
     String num1,num2;
     JLabel l1,l2,result;
     JTextField screen;
     JButton  one, two, three, four;
     JButton plus, minus,  equal;
     final int FRAME_WIDTH = 300;
final int FRAME_HEIGHT = 250;
public JFrameWithManyComponents()   {
super("Mini Calculator ");
setSize(FRAME_WIDTH, FRAME_HEIGHT);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 screen = new JTextField(22);
 one = new JButton("  1  ");
 two = new JButton("  2  ");
 three = new JButton("  3  ");
 four = new JButton("  4  ");
 plus = new JButton("  +  ");
 minus = new JButton("  -  ");
 equal = new JButton("  =  ");
 one.addActionListener(this);
two.addActionListener(this);
three.addActionListener(this);
four.addActionListener(this);
plus.addActionListener(this);
minus.addActionListener(this);
equal.addActionListener(this);
setLayout(new FlowLayout());
add(screen);
add(one);
add(two);
add(three);
add(four);
add(plus);
add(minus);
add(equal);     }
//@override
public void actionPerformed(ActionEvent e)  {
    Object source=e.getSource();
    if(source == one)    {
        String t1 = "1";
        String prev;
        prev = screen.getText();
screen.setText(prev+t1);     }               
    else  if(source == two)    {
        String t1 = "2";
        String prev;
        prev = screen.getText();
screen.setText(prev+t1);    }               
 else  if(source == three)    {
        String t1 = "3";
        String prev;
        prev = screen.getText();
screen.setText(prev+t1);     }               
    else  if(source == four)    {
        String t1 = "4";
        String prev;
        prev = screen.getText();
screen.setText(prev+t1);     }            
    else  if(source == plus)    {
       symbol = '+';
        num1 = screen.getText();
        screen.setText( "");     }
    else  if(source == minus)    {
       symbol = '-';
        num1 = screen.getText();
        screen.setText( "");           }
    else if(source == equal)    {
        num2 = screen.getText();
 if (symbol=='+')        {
            int fnum = Integer.parseInt(num1);
            int snum = Integer.parseInt(num2);
            int sum = fnum+snum;
            String s = String.valueOf(sum);
            screen.setText(s);         }
        else if (symbol=='-')        {
            int fnum = Integer.parseInt(num1);
            int snum = Integer.parseInt(num2);
            int sum = fnum-snum;
            String s = String.valueOf(sum);
            screen.setText(s);        }     }  }   }
public class MiniCalculator {
    public static void main(String[] args) {
       JFrameWithManyComponents frame =new JFrameWithManyComponents();
     
        frame.setVisible(true);  // TODO code application logic here
    }
    
}

