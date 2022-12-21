import javax.swing.*;
import java.awt.event.*;
class GUI extends JFrame implements ItemListener
{
    JCheckBox c1,c2,c3;
    GUI()
    {
        c1 = new JCheckBox("tea");
        c2 = new JCheckBox("coffee");
        c3 = new JCheckBox("sodda");
        setTitle("check boxes");
        setLocation(500,200);
        setSize(440,500);
        setLayout(null);
        c1.setBounds(30,120,150,30);
        c2.setBounds(100,140,150,30);
        c3.setBounds(170,160,150,30);
        add(c1);
        add(c2);
        add(c3);
       c1.addItemListener(this);
       c2.addItemListener(this);
       c3.addItemListener(this);  
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if (ie.getSource()==c1)
        {
            JOptionPane.showMessageDialog(this, " you have click the tea");
        }
        if (ie.getSource()==c2)
        {
            JOptionPane.showMessageDialog(this, " you have click the coppy");
        }
        if (ie.getSource()==c3)
        {
            JOptionPane.showMessageDialog(this, " you have click the sodda");
        }}}
public class test {
 public static void main(String[] args)
    {
        GUI ss = new GUI();
        ss.setVisible(true);
        ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } }
