/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlibrary;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author bikash
 */
public class ReturnBookForm1 extends javax.swing.JFrame {

    /**
     * Creates new form IssueBookForm
     */
    public ReturnBookForm1() {
        initComponents();
           Calendar cal = Calendar.getInstance();

        IDate.setText(String.valueOf(cal.get(Calendar.DATE)));
        IMonth.setText(String.valueOf(cal.get(Calendar.MONTH)+1));
        IYear.setText(String.valueOf(cal.get(Calendar.YEAR)));
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
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        UserID = new javax.swing.JTextField();
        BookID = new javax.swing.JTextField();
        IMonth = new javax.swing.JTextField();
        IYear = new javax.swing.JTextField();
        IDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 130));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Book ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 48));

        jLabel2.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("User ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, 38));

        jLabel4.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Return Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 116, 43));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 99, 43));

        UserID.setFont(new java.awt.Font("Bodoni Bk BT", 1, 18)); // NOI18N
        UserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDActionPerformed(evt);
            }
        });
        getContentPane().add(UserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 335, 47));

        BookID.setFont(new java.awt.Font("Bodoni Bk BT", 1, 18)); // NOI18N
        BookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookIDActionPerformed(evt);
            }
        });
        getContentPane().add(BookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 335, 48));

        IMonth.setEditable(false);
        IMonth.setBackground(new java.awt.Color(224, 218, 213));
        getContentPane().add(IMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 59, 36));

        IYear.setEditable(false);
        IYear.setBackground(new java.awt.Color(224, 218, 213));
        IYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IYearActionPerformed(evt);
            }
        });
        getContentPane().add(IYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 62, 36));

        IDate.setEditable(false);
        IDate.setBackground(new java.awt.Color(224, 218, 213));
        IDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDateActionPerformed(evt);
            }
        });
        getContentPane().add(IDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 59, 36));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel7.setText("-");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 16, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jLabel8.setText("-");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 16, -1));

        jLabel5.setFont(new java.awt.Font("Bodoni Bk BT", 1, 55)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("RETURN BOOK FORM");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Sinhgad College Library");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("TypoUpright BT", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Library Managment System");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\photo-1481627834876-b7833e8f5570.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int BookIDV;
        BookIDV = Integer.parseInt(BookID.getText());
        int UserIDV;
        UserIDV = Integer.parseInt(UserID.getText());
        
        String IFDate = IYear.getText() + "-"+IMonth.getText()+"-"+IDate.getText();
        System.out.println(IFDate);
        
        //Date IFDDate = cal.getDate();
        
     
        
        if(TransBookDao1.BookValidate(BookID.getText()) && TransBookDao1.UserValidate(UserID.getText()))
        {
               if(TransBookDao1.CheckIssuedBook(BookIDV))
               {
                   
                   if(TransBookDao1.ReturnBook(BookIDV, UserIDV)!=0)
                   {
                        JOptionPane.showMessageDialog(ReturnBookForm1.this, "Book is returned by the User!","Returning Book Successfull!", JOptionPane.ERROR_MESSAGE);
                        UserID.setText("");
                        BookID.setText("");
                   }
                   else
                        JOptionPane.showMessageDialog(ReturnBookForm1.this, "Unable to Return Book!","Returning Book Error!", JOptionPane.ERROR_MESSAGE);
                       
               }
               else
                JOptionPane.showMessageDialog(ReturnBookForm1.this, "The Book  is NOT Issued by THIS User!","Issuing Book Error!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {    if(TransBookDao1.UserValidate(UserID.getText()))
                    JOptionPane.showMessageDialog(ReturnBookForm1.this, "The Book  is NOT available in Library Database!","Returning Book Error!", JOptionPane.ERROR_MESSAGE);
             else
                if(TransBookDao1.BookValidate(BookID.getText()))
                    JOptionPane.showMessageDialog(ReturnBookForm1.this, "The User is NOT available in Library Database!","Returning Book Error!", JOptionPane.ERROR_MESSAGE);
                 else
            JOptionPane.showMessageDialog(ReturnBookForm1.this, "The Book  and User are NOT available in Library Database!","Returning Book Error!", JOptionPane.ERROR_MESSAGE);
       
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LibrarianSuccess2.ThisLogined.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIDActionPerformed

    private void IYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IYearActionPerformed

    private void BookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookIDActionPerformed

    private void IDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDateActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBookForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBookForm1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookID;
    private javax.swing.JTextField IDate;
    private javax.swing.JTextField IMonth;
    private javax.swing.JTextField IYear;
    private javax.swing.JTextField UserID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
