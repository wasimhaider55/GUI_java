import javax.swing.*;
import java.awt.*;
final class GUI
{
    JFrame frame;
    JPanel textpanel,buttonpanel;
    JTextField idtxt,nametx,adresstxt;
    JLabel idlabel,namelabel,adresslabel;
    JButton bfirst,bprevious,bnext,blast,bexit,badd,bdelet,bedit,bcancel,bsave;
    public void initalize()
    {
      frame = new JFrame("complex layout"); 
      textpanel = new JPanel();
      buttonpanel = new JPanel();
      idtxt = new JTextField(10); nametx = new JTextField(10); adresstxt = new JTextField(10);
      idlabel = new JLabel("student ID");  namelabel = new JLabel("student name");  adresslabel = new JLabel("student ADress");
      bfirst = new JButton("first");bprevious = new JButton("previous");bnext = new JButton("next");
      blast = new JButton("last");bexit = new JButton("exit");
      badd = new JButton("add");bdelet = new JButton("delet");bedit = new JButton("edit");
      bcancel = new JButton("cancel");bsave = new JButton("save");
     /////////////////////////////////////////////////
      textpanel.setLayout(new GridLayout(3,2,10,20));
      textpanel.add(idlabel); textpanel.add(idtxt);
     textpanel.add(namelabel); textpanel.add(nametx);
     textpanel.add(adresslabel); textpanel.add(adresstxt);
     idlabel.setForeground(Color.red);idtxt.setForeground(Color.blue);
      ////////////////////////////////////////////
      buttonpanel.setLayout(new GridLayout(2,5,20,10));
      buttonpanel.add(bfirst);buttonpanel.add(bprevious);buttonpanel.add(bnext);buttonpanel.add(blast);buttonpanel.add(bexit);
      buttonpanel.add(badd);buttonpanel.add(bdelet);buttonpanel.add(bedit);buttonpanel.add(bcancel);buttonpanel.add(bsave);
     bfirst.setForeground(Color.green);
     bfirst.setBackground(Color.red);
//////////////////////////////////////////////////////////////////////////////////////////////////////
      frame.add(textpanel,BorderLayout.NORTH);
      frame.add(buttonpanel,BorderLayout.SOUTH);
      frame.setSize(600, 550);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container con = frame.getContentPane();
      con.setBackground(Color.yellow);
      textpanel.setBackground(Color.yellow);
      buttonpanel.setBackground(Color.yellow);
    }
    GUI()
    {
      initalize(); 
    }
    
}

public class test {

    
    public static void main(String[] args) {
        GUI g= new GUI();
    }
    
}
