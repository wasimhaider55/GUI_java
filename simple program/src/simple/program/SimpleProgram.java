package simple.program;
import javax.swing.*;
import java.awt.FlowLayout;
class GUI extends JFrame
{
    JFrame frame;
    JButton ok,Exit;
    GUI()
    {
        frame = new JFrame("uff yar");
        ok = new JButton("OK");
        Exit = new JButton("Exit");
        frame.setLayout(null);
        ok.setBounds(110, 160, 110, 40);
        Exit.setBounds(120, 40, 180, 40);
        frame.add(ok);
        frame.add(Exit);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class SimpleProgram {

    public static void main(String[] args)
    {
        GUI G = new GUI();
    }
    
}
