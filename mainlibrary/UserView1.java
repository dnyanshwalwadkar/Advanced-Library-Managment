/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlibrary;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bikash
 */
public class UserView1 extends javax.swing.JFrame {

    /**
     * Creates new form ViewBook
     * @throws java.sql.SQLException
     */
    
    public static String UserID;
    
    public UserView1() throws SQLException {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        initComponents();
        
        int UserIDV =Integer.parseInt(UserID);
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
       // String Data[][]=null;
      //  String Column[]=null;
        try(Connection Con = DB1.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select library.IssuedBook.BookID,library.Books.BookName , IssuedBook.IssueDate, IssuedBook.ReturnDate from library.Books,library.IssuedBook where Books.BookID=IssuedBook.BookID and IssuedBook.UserID=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ps.setInt(1,UserIDV);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
        
            
            
         /*   Column = new String[colnum];
            for(int i=1;i<=colnum;i++){
               Column[i-1]=rsmd.getColumnClassName(i);
                }
            rs.last();
            
            int rows=rs.getRow();
            rs.beforeFirst();
            
            String[][] data = new String[rows][colnum];
            
            int count=0; */
            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    Row[i-1]=rs.getString(i);
                    }
                 model.addRow(Row);
            }
   
                    //count++;
               
            
           Con.close();
        }catch(Exception e){System.out.println(e);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Bodoni Bk BT", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Book ID", "Name", "Issued Date", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 122, 1464, 357));

        jLabel1.setBackground(new java.awt.Color(255, 255, 102));
        jLabel1.setFont(new java.awt.Font("Bodoni Bk BT", 1, 60)); // NOI18N
        jLabel1.setText("BOOKS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 41, 212, 63));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 492, 110, 63));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel4.setText("jLabel2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel5.setText("jLabel2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel6.setText("jLabel2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel7.setText("jLabel2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel8.setText("jLabel2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel9.setText("jLabel2");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code hereset
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserView1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UserView1().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UserView1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
       UserID = args[0];
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}
