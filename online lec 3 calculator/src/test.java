import javax.swing.*;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.FlowLayout;
class GUI extends JFrame implements ActionListener {
    char symbol;
    String num1,num2;
JTextField tf;
JButton b1,b2,b3,bplus,bminus,bequal;

GUI(){
    setTitle("calculator");
    setLocation(230,200);
    setSize(350,500);
    setLayout(null);
    tf = new JTextField(25);
    tf.setBounds(50, 30,200,30);
    b1 = new JButton("1");
    b1.setBounds(50, 200, 50, 30);
    b2 = new JButton("2");
    b2.setBounds(110, 200, 50, 30);
    b3 = new JButton("3");
    b3.setBounds(170, 200, 50, 30);
    bplus = new JButton("+");
    bplus.setBounds(50, 260, 50, 30);
    bminus = new JButton("-");
    bminus.setBounds(110, 260, 50, 30);
    bequal = new JButton("=");
    bequal.setBounds(170, 260, 50, 30);
   
    add(tf);
    add(b1);
    add(b2);
    add(b3);
    add(bplus);
    add(bminus);
    add(bequal);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    bplus.addActionListener(this);
    bminus.addActionListener(this);
    bequal.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
    Object s = ae.getSource();
    if (s==b1)
    {
     String t1 = "1";
     String prev;
     prev = tf.getText();
     tf.setText(prev+t1);
}
     else if (s==b2)
    {
     String t1 = "2";
     String prev;
     prev = tf.getText();
     tf.setText(prev+t1);
}
     else  if (s==b3)
    {
     String t1 = "3";
     String prev;
     prev = tf.getText();
     tf.setText(prev+t1);
    }
     else if (s == bplus)
     {
         symbol = '+';
         num1 = tf.getText();
         tf.setText(" ");
     }
    else if (s == bminus)
     {
         symbol = '-';
         num1 = tf.getText();
         tf.setText(" ");
     }
    else if (s == bequal)
     {
         symbol = '=';
         num2 = tf.getText();
         if ( symbol == '+' ){
             int fnum = Integer.parseInt(num1);
             int snum = Integer.parseInt(num2);
             int sum = fnum + snum ;
             String ss = String.valueOf(sum);
             tf.setText(ss);
         }
        else if ( symbol == '-' ){
             int fnum = Integer.parseInt(num1);
             int snum = Integer.parseInt(num2);
             int sum = fnum - snum ;
             String ss = String.valueOf(sum);
             tf.setText(ss);
       } }}}
public class test {
    public static void main(String[] args) 
    {
        GUI s = new GUI();
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }  }
