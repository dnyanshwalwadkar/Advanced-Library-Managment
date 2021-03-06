/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlibrary;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import static mainlibrary.LibrarianSuccess2.ThisLogined;
/**
 *
 * @author bikash
 */
public class IssueBookForm1 extends javax.swing.JFrame {

    /**
     * Creates new form IssueBookForm1
     */
    public IssueBookForm1() {
        initComponents();
        int year;
        Calendar cal = Calendar.getInstance();
        year = cal.get(Calendar.YEAR);
        String TodayYear;
        TodayYear = String.valueOf(year);
        IYear.setText(TodayYear);
        String TodayMonth = String.valueOf(cal.get(Calendar.MONTH)+1);
        IMonth.setText(TodayMonth);
        String TodayDate = String.valueOf(cal.get(Calendar.DATE));
        IDate.setText(TodayDate);
        
        Calendar addcal = null;
        addcal = cal;
        addcal.add(Calendar.DAY_OF_YEAR,15);

        RDate.setText(String.valueOf(addcal.get(Calendar.DATE)));
        RMonth.setText(String.valueOf(addcal.get(Calendar.MONTH)+1));
        RYear.setText(String.valueOf(addcal.get(Calendar.YEAR)));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        UserID = new javax.swing.JTextField();
        BookID = new javax.swing.JTextField();
        IMonth = new javax.swing.JTextField();
        RMonth = new javax.swing.JTextField();
        IYear = new javax.swing.JTextField();
        IDate = new javax.swing.JTextField();
        RYear = new javax.swing.JTextField();
        RDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(121, 22, 127));
        setForeground(new java.awt.Color(30, 51, 252));
        setLocation(new java.awt.Point(560, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("User ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Issue Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Return Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jButton1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton1.setText("Issue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 116, 43));

        jButton2.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 103, 43));

        UserID.setFont(new java.awt.Font("Bodoni Bd BT", 1, 24)); // NOI18N
        UserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDActionPerformed(evt);
            }
        });
        getContentPane().add(UserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 250, 35));

        BookID.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        BookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookIDActionPerformed(evt);
            }
        });
        getContentPane().add(BookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 250, 35));

        IMonth.setEditable(false);
        IMonth.setBackground(new java.awt.Color(193, 193, 193));
        IMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMonthActionPerformed(evt);
            }
        });
        getContentPane().add(IMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 59, 36));
        getContentPane().add(RMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 59, 36));

        IYear.setEditable(false);
        IYear.setBackground(new java.awt.Color(193, 193, 193));
        getContentPane().add(IYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 59, 36));

        IDate.setEditable(false);
        IDate.setBackground(new java.awt.Color(193, 193, 193));
        IDate.setToolTipText("");
        IDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDateActionPerformed(evt);
            }
        });
        getContentPane().add(IDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 59, 36));

        RYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RYearActionPerformed(evt);
            }
        });
        getContentPane().add(RYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 59, 36));
        getContentPane().add(RDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 59, 36));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel5.setText("-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 16, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel6.setText("-");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 16, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel7.setText("-");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 16, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel8.setText("-");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 16, -1));

        jLabel10.setFont(new java.awt.Font("Bodoni Bk BT", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("ISSUE BOOK");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Sinhgad College Library");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("TypoUpright BT", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Library managment System");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\photo-1481627834876-b7833e8f5570.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int BookIDV;
        BookIDV = Integer.parseInt(BookID.getText());
        int UserIDV;
        UserIDV = Integer.parseInt(UserID.getText());
        
        String IFDate = IYear.getText() + "-"+IMonth.getText()+"-"+IDate.getText();
        String RFDate = RYear.getText() + "-"+RMonth.getText()+"-"+RDate.getText();
        System.out.println(IFDate);
        
        //Date IFDDate = cal.getDate();
        
     
        
        if(TransBookDao1.BookValidate(BookID.getText()) && TransBookDao1.UserValidate(UserID.getText()))
        {
          
            if(TransBookDao1.Check(UserIDV)==0)
               JOptionPane.showMessageDialog(IssueBookForm1.this, "User has already Issued Maximum No of Books","Issue Error!", JOptionPane.ERROR_MESSAGE); 
           else
            {
            if(TransBookDao1.IssueBook(BookIDV, UserIDV, IFDate, RFDate)!=0)
            {
              
                JOptionPane.showMessageDialog(IssueBookForm1.this, "The Book  is Issued!","Book Issued!", JOptionPane.ERROR_MESSAGE);
                BookID.setText("");
                UserID.setText("");
            }
            else
              JOptionPane.showMessageDialog(IssueBookForm1.this, "Unable to Issue Book!","Issuing Book Error!", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
        else
        {    if(TransBookDao1.UserValidate(UserID.getText()))
                    JOptionPane.showMessageDialog(IssueBookForm1.this, "The Book  is NOT available in Library Database!","Issuing Book Error!", JOptionPane.ERROR_MESSAGE);
             else
                if(TransBookDao1.BookValidate(BookID.getText()))
                    JOptionPane.showMessageDialog(IssueBookForm1.this, "The User is NOT available in Library Database!","Issuing Book Error!", JOptionPane.ERROR_MESSAGE);
                 else
            JOptionPane.showMessageDialog(IssueBookForm1.this, "The Book  and User are NOT available in Library Database!","Issuing Book Error!", JOptionPane.ERROR_MESSAGE);
       
        }
      //  if(IssueBookDao.)
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ThisLogined.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIDActionPerformed

    private void IDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDateActionPerformed

    private void IMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IMonthActionPerformed

    private void RYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RYearActionPerformed

    private void BookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBookForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBookForm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookID;
    private javax.swing.JTextField IDate;
    private javax.swing.JTextField IMonth;
    private javax.swing.JTextField IYear;
    private javax.swing.JTextField RDate;
    private javax.swing.JTextField RMonth;
    private javax.swing.JTextField RYear;
    private javax.swing.JTextField UserID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
