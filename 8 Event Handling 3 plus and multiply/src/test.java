import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
class GUI implements ActionListener
{
JFrame frame;
JButton plus,multiply;
JLabel firstnumber,secondnumber,Result;
JTextField firsttxt,secondtxt,Resulttxt;
int number1,number2,RESULT;
String myvalue;
public void initilazie()
{
    frame = new JFrame("Calculator");
    plus = new JButton("+");  multiply = new JButton("*");
    firstnumber = new JLabel("firstnumber");
    secondnumber = new JLabel("secondnumber");
    Result = new JLabel("result");
    firsttxt = new JTextField(10);
    secondtxt = new JTextField(10);
    Resulttxt = new JTextField(10);
    frame.setLayout(new FlowLayout());
    frame.add(firstnumber); frame.add(firsttxt);
    frame.add(secondnumber); frame.add(secondtxt);
    frame.add(plus);frame.add(multiply);
    frame.add(Result); frame.add(Resulttxt);
    frame.setVisible(true);
    frame.setSize(100, 220);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    plus.addActionListener(this);
    multiply.addActionListener(this);
}
public GUI()
{
    initilazie();
}
public void actionPerformed(ActionEvent ae)
{
    if (ae.getSource()== plus)
    {
        myvalue = firsttxt.getText();
        number1 = Integer.parseInt(myvalue);
        myvalue = secondtxt.getText();
        number2 = Integer.parseInt(myvalue);
        RESULT = number1+number2;
        Resulttxt.setText(RESULT+" ");
    }
    if (ae.getSource()== multiply)
    {
        myvalue = firsttxt.getText();
        number1 = Integer.parseInt(myvalue);
        myvalue = secondtxt.getText();
        number2 = Integer.parseInt(myvalue);
        RESULT = number1 * number2;
        Resulttxt.setText(RESULT+" ");
    }
}

}
public class test {

    public static void main(String[] args)
    {
        GUI g = new GUI();  

    }
    
}
