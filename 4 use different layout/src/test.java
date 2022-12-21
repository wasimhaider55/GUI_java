import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
class GUI{
    JFrame frame;
    JPanel panel;
    JTextField tx;
    JLabel lb;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bclear,bplus,bminus,bmul,bdecimal,bequal;
    public void initalize()
    {
     frame = new JFrame("Calculator");
     panel = new JPanel();
     tx = new JTextField();
     lb = new JLabel("my calculator");
     b0 = new JButton("0");b1 = new JButton("1");b2 = new JButton("2");b3 = new JButton("3");
     b4 = new JButton("4");b5 = new JButton("5");b6 = new JButton("6");b7 = new JButton("7");
     b8 = new JButton("8");b9 = new JButton("9");bclear = new JButton("C");bplus = new JButton("+");
     bminus = new JButton("-");bmul = new JButton("*");bdecimal = new JButton(".");bequal = new JButton("=");
    panel.setLayout(new GridLayout(4,4));
    panel.add(b1);    panel.add(b2);    panel.add(b3);    panel.add(bclear);
    panel.add(b4);    panel.add(b5);    panel.add(b6);    panel.add(bmul);
    panel.add(b7);    panel.add(b8);    panel.add(b9);    panel.add(bminus);
    panel.add(b0);    panel.add(bdecimal);    panel.add(bplus);    panel.add(bequal);
frame.add(tx,BorderLayout.NORTH);
frame.add(lb,BorderLayout.SOUTH);
frame.add(panel,BorderLayout.CENTER);
frame.setVisible(true);
frame.setSize(600, 500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
  GUI()
  {
   initalize();   
  }  
}
public class test {

    
    public static void main(String[] args) {
        GUI  g = new GUI();
    }
    
}
