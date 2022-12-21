package pkg13;
import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
class GUI extends WindowAdapter implements ActionListener
{
    JFrame frame;
    JButton add,multiply;
    JLabel firstlabel,secondlabel,resultlabel;
    JTextField firsttxt,secondtxt,resulttxt;
    int number1,number2,result;
    String val;
    public void initilazie()
    {
        frame = new JFrame("adapter mathod");
        add = new JButton("+");
        multiply = new JButton("*");
        firstlabel = new JLabel ("first operend");
        secondlabel = new JLabel ("second operend");
        resultlabel = new JLabel ("result operend");
        firsttxt = new JTextField(10);
        secondtxt = new JTextField(10);
        resulttxt = new JTextField(10);
        frame.setLayout(new FlowLayout());
        frame.add(firstlabel); frame.add(firsttxt);
        frame.add(secondlabel);frame.add(secondtxt);
        frame.add(add);frame.add(multiply);
        frame.add(resultlabel); frame.add(resulttxt);
        resulttxt.setEditable(false);
        frame.setVisible(true);
        frame.setSize(120,230);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.addWindowListener(this);
        add.addActionListener(this);
        multiply.addActionListener(this);
    }
    GUI()
    {
        initilazie();
    }
    public void windowOpened(WindowEvent we)
    {
        JOptionPane.showMessageDialog(frame, "welcome G");
    }
    public void windowClosing(WindowEvent we)
    {
        JOptionPane.showMessageDialog(frame, "goo bye have a nice day");
    }
    public void actionPerformed(ActionEvent ae)
    {
        val = firsttxt.getText();
        number1 = Integer.parseInt(val);
        val = secondtxt.getText();
        number2 = Integer.parseInt(val);
        if (ae.getSource()==add)
        {
            result = number1 + number2;
            resulttxt.setText(result + " ");
        }
        val = firsttxt.getText();
        number1 = Integer.parseInt(val);
        val = secondtxt.getText();
        number2 = Integer.parseInt(val);
        if (ae.getSource()==multiply)
        {
            result = number1 * number2;
            resulttxt.setText(result + " ");
        }    
    }
}
public class test {

    
    public static void main(String[] args) 
    {
      GUI G = new GUI(); 
    }
    
}
