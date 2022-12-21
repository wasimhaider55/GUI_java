import javax.swing.*;
import java.awt.event.*;
class GUI extends JFrame implements ItemListener,ActionListener
{
    JComboBox comb1,combo2;
    JButton show , Exit;
    JLabel lab1,lab2;
    String name[];
  GUI (){
      setTitle("combo bocx example");
      setLocation(400,200);
      setSize(500,500);
      setLayout(null);
      name = new String[5];
      name[0] = "pakistan ";
      name[1] = " egypt";
      name[2]= " london";
      name[3]= " france";
      name[4] = "chaina";
       comb1 = new JComboBox(name);
       combo2 = new JComboBox(name);
       show = new JButton("show");
       Exit = new JButton("Exit");
       lab1 = new JLabel ("selected country :  ");
       lab2 = new JLabel (" selected coutry ");
       comb1.setBounds(10,50,150,30);
       combo2.setBounds(10,300,150,30);
       show.setBounds(10,200,80,30);
       Exit.setBounds(120,200,80,30);
       lab1.setBounds(180,50,250,30);
       lab2.setBounds(180,300,250,30);
      add(comb1);
      add(combo2);
      add(show);
      add(Exit);
      add(lab1);
      add(lab2);
      show.addActionListener(this);
      Exit.addActionListener(this);
     comb1.addItemListener(this);
  } 
  public void itemStateChanged(ItemEvent ie)
  {      
      String s = "country selected :: " + comb1.getSelectedItem();
      lab1.setText(s);
  }
  public void actionPerformed(ActionEvent ae)
  {
      String s  = " country selected : " + comb1.getSelectedItem();
      Object source = ae.getSource();
      if (source==show)
          lab1.getText();
                  if (source==Exit)
                      System.exit(1);   
  }}
public class OnlineLec4 {
    public static void main(String[] args)
   {
     GUI ss = new GUI();
     ss.setVisible(true);
     ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } }
