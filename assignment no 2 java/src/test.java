import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Container;
class GUI extends JFrame implements ActionListener  {
    JMenuBar mainbar;
   JMenu calculator;
   JMenuItem simple ,scientific,Exit;
   
    GUI()
    {
        Container con = getContentPane();
        setTitle("Manu");
        setLocation(500,200);
        setSize(400,400);
        setLayout(new FlowLayout());
        mainbar = new JMenuBar();
        mainbar.setBackground(Color.blue);
        calculator = new JMenu(" select Calculator");
        simple = new JMenuItem("simple calculator");
        scientific = new JMenuItem ("scientific Calculator");
        Exit = new JMenuItem("Exit");
        mainbar.add(calculator);
        setJMenuBar(mainbar);
        mainbar.add(calculator);
        calculator.add(simple);
        calculator.add(scientific);
        calculator.add(Exit); 
        simple.addActionListener(this);
        scientific.addActionListener(this);
        Exit.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()== simple)
        {
            
        }
        if (ae.getSource()== scientific)
        {
            
        }
        if (ae.getSource()== Exit)
            System.exit(1);
    }
    
    
}
public class test {

    public static void main(String[] args)
    {
       GUI ss = new GUI();
       ss.setVisible(true);
       ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
