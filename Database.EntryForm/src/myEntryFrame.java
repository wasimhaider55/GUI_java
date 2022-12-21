import java.awt.Color;
import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class myEntryFrame extends javax.swing.JFrame   {
  public myEntryFrame() {
        initComponents();
        Container con;
         con = this.getContentPane();
         con.setBackground(Color.cyan);
         bSearch.setBackground(Color.BLUE);
         bSearch.setForeground(Color.WHITE);
         bAdd.setBackground(Color.BLUE);
         bAdd.setForeground(Color.WHITE);
          bClose.setBackground(Color.BLUE);
         bClose.setForeground(Color.WHITE);
          tDelete.setBackground(Color.BLUE);
         tDelete.setForeground(Color.WHITE);
          bClear.setBackground(Color.BLUE);
         bClear.setForeground(Color.WHITE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tName = new javax.swing.JTextField();
        tRegNo = new javax.swing.JTextField();
        tMarks = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bClose = new javax.swing.JButton();
        tSearch = new javax.swing.JTextField();
        bSearch = new javax.swing.JButton();
        tDelete = new javax.swing.JButton();
        bClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student Name");

        jLabel2.setText("Registration NO");

        jLabel3.setText("Marks");

        tName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNameActionPerformed(evt);
            }
        });

        tRegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tRegNoActionPerformed(evt);
            }
        });

        tMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMarksActionPerformed(evt);
            }
        });

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bClose.setText("Close");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        tSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSearchActionPerformed(evt);
            }
        });

        bSearch.setText("Serach");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        tDelete.setText("Delete");
        tDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDeleteActionPerformed(evt);
            }
        });

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(tDelete))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSearch)
                    .addComponent(tRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(bClose)
                        .addGap(18, 18, 18)
                        .addComponent(bClear)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tMarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd)
                    .addComponent(bClose)
                    .addComponent(tDelete)
                    .addComponent(bClear))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNameActionPerformed
        
    }//GEN-LAST:event_tNameActionPerformed

    private void tRegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tRegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tRegNoActionPerformed

    private void tMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMarksActionPerformed

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
      JOptionPane.showMessageDialog(this, "do you want to really close");
        System.exit(1);
    }//GEN-LAST:event_bCloseActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        try {
            Connection con = null;
            PreparedStatement pst = null;
            con = DriverManager.getConnection("jdbc:ucanaccess://M:\\Student.accdb");
            String sqlst = "insert into stTable(Name,R_No,Marks) values (?,?,?)";
            pst = con.prepareStatement(sqlst);
            pst.setString(1,tName.getText());
            pst.setString(2,tRegNo.getText());
            pst.setString(3,tMarks.getText());
            pst.execute();
            JOptionPane.showMessageDialog(this, "The informotion is Succefully Added");
            tName.setText("");
            tRegNo.setText("");
            tMarks.setText("");   
        } catch (SQLException ex) {
            Logger.getLogger(myEntryFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bAddActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
              Connection con = null;
            PreparedStatement pst = null;
            ResultSet rs = null;
        try {

            con = DriverManager.getConnection("jdbc:ucanaccess://M:\\Student.accdb");
            String sqlst = "select * from stTable where R_No = ?";
            pst = con.prepareStatement(sqlst);
            pst.setInt(1,Integer.parseInt(tSearch.getText()));
             rs = pst.executeQuery();
            if(rs.next())
            {
             //String name = rs.getString(1);
            tName.setText(rs.getString(1));
            tRegNo.setText(String.valueOf(rs.getInt(2)));
            tMarks.setText(String.valueOf(rs.getInt(3)));
            }
            else 
                JOptionPane.showMessageDialog(this, "Invalid number plz try again");
            pst.close();
            rs.close();
            con.close();
           } catch (SQLException ex) {
             Logger.getLogger(myEntryFrame.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_bSearchActionPerformed

    private void tSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSearchActionPerformed

    }//GEN-LAST:event_tSearchActionPerformed

    private void tDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDeleteActionPerformed
     try {
 Connection con = null;
 PreparedStatement pst = null;
 con = DriverManager.getConnection("jdbc:ucanaccess://M:\\Student.accdb");
 Statement st = con.createStatement();
 String Reg = tRegNo.getText();
 st.executeUpdate("Delete from Student_Table where R_No ='" +tRegNo.getText()+" ");
  JOptionPane.showMessageDialog(this,"Do you want to Delete");
  tName.setText("");
 tRegNo.setText("");
 tMarks.setText("");
 tSearch.setText("");
  } catch (SQLException ex) {
 JOptionPane.showMessageDialog(this,ex);
 Logger.getLogger(myEntryFrame.class.getName()).log(Level.SEVERE, null, ex);
 }
    }//GEN-LAST:event_tDeleteActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
            tName.setText("");
            tRegNo.setText("");
            tMarks.setText(""); 
            tSearch.setText("");
    }//GEN-LAST:event_bClearActionPerformed
public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(myEntryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myEntryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myEntryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myEntryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myEntryFrame().setVisible(true);
       }});}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bClose;
    private javax.swing.JButton bSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton tDelete;
    private javax.swing.JTextField tMarks;
    private javax.swing.JTextField tName;
    private javax.swing.JTextField tRegNo;
    private javax.swing.JTextField tSearch;
    // End of variables declaration//GEN-END:variables
}
