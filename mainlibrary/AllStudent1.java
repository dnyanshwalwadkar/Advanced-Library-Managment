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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bikash
 */
public class AllStudent1 extends javax.swing.JFrame {

    /**
     * Creates new form ViewBook
     * @throws java.sql.SQLException
     */
    public AllStudent1() throws SQLException {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        initComponents();
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
       // String Data[][]=null;
      //  String Column[]=null;
        try(Connection Con = DB1.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select * from library.Users",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
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

        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        NameRadio = new javax.swing.JRadioButton();
        SearchField = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        AuthorRadio = new javax.swing.JRadioButton();
        ALL = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel17.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "User ID", "UserPass", "RegDate", "UserName", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 1398, 311));

        jLabel1.setFont(new java.awt.Font("Bodoni Bd BT", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("USER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, -1, -1));

        jButton1.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 511, 149, 51));

        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        NameRadio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameRadio.setText("Name");
        NameRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameRadioActionPerformed(evt);
            }
        });

        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });

        Search.setBackground(new java.awt.Color(204, 204, 0));
        Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        AuthorRadio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AuthorRadio.setText("Email");
        AuthorRadio.setToolTipText("");
        AuthorRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorRadioActionPerformed(evt);
            }
        });

        ALL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ALL.setText("ALL");
        ALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(846, 846, 846)
                        .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(NameRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(AuthorRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ALL, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AuthorRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ALL, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 1390, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 500, 240));

        jLabel4.setText("jLabel2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 240));

        jLabel6.setText("jLabel2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, 500, 240));

        jLabel8.setText("jLabel2");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 500, 240));

        jLabel9.setText("jLabel2");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 500, 240));

        jLabel10.setFont(new java.awt.Font("TypoUpright BT", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Librabry Managment System");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 500, -1, -1));

        jLabel7.setText("jLabel2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, 500, 240));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Sinhgad College Library");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 50, -1, -1));

        jLabel5.setText("jLabel2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 500, 240));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel12.setText("jLabel2");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 240));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel13.setText("jLabel2");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 500, 240));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel14.setText("jLabel2");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 240));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel15.setText("jLabel2");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 500, 240));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel16.setText("jLabel2");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 500, 240));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel18.setText("jLabel2");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 500, 240));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel19.setText("jLabel2");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 500, 240));

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dnyanesh\\Desktop\\Library images\\mybg.jpg")); // NOI18N
        jLabel20.setText("jLabel2");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, 500, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code hereset
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALLActionPerformed
        // TODO add your handling code here:
        NameRadio.setSelected(false);
        AuthorRadio.setSelected(false);
        SearchField.setText("");
        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        while(model.getRowCount()>0)
        model.removeRow(model.getRowCount()-1);
        // String Data[][]=null;
        //  String Column[]=null;
        try(Connection Con = DB1.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select * from library.Users",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
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
    }//GEN-LAST:event_ALLActionPerformed

    private void AuthorRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorRadioActionPerformed
        // TODO add your handling code here:
        NameRadio.setSelected(false);
        ALL.setSelected(false);
    }//GEN-LAST:event_AuthorRadioActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model;
        model = (DefaultTableModel) jTable1.getModel();
        while(model.getRowCount()>0)
        model.removeRow(model.getRowCount()-1);
        if(NameRadio.isSelected())
        {
            // String Data[][]=null;
            //  String Column[]=null;
            String Search = "%"+SearchField.getText()+"%";
            try(Connection Con = DB1.getConnection()) {
                PreparedStatement ps=Con.prepareStatement("select * from library.Users where UserName like ?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                ps.setString(1, Search);
                ResultSet rs= ps.executeQuery();

                ResultSetMetaData rsmd = rs.getMetaData();

                int colnum=rsmd.getColumnCount();

                //code here
                String Row[];
                Row = new String[colnum];
                while(rs.next()){
                    for(int i=1;i<=colnum;i++){
                        Row[i-1]=rs.getString(i);
                    }
                    model.addRow(Row);
                }
                int rowcount = model.getRowCount();
                System.out.println(rowcount);
                if(rowcount==0)
                {
                    String NoRow[];
                    NoRow = new String[7];
                    NoRow[1]="NO";
                    NoRow[2]="RESULT";
                    NoRow[0]="";
                    NoRow[3]="";
                    NoRow[4]="";
                    NoRow[5]="";
                    NoRow[6]="";
                    model.addRow(NoRow);

                }

                //count++;

                Con.close();
            }catch(Exception e){System.out.println(e);
            } }

            else if(AuthorRadio.isSelected())
            {

                // String Data[][]=null;
                //  String Column[]=null;
                String Search = "%"+SearchField.getText()+"%";
                try(Connection Con = DB1.getConnection()) {
                    PreparedStatement ps=Con.prepareStatement("select * from library.Users where Email like ?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                    ps.setString(1, Search);
                    ResultSet rs= ps.executeQuery();

                    ResultSetMetaData rsmd = rs.getMetaData();

                    int colnum=rsmd.getColumnCount();

                    //code here
                    String Row[];
                    Row = new String[colnum];
                    while(rs.next()){
                        for(int i=1;i<=colnum;i++){
                            Row[i-1]=rs.getString(i);
                        }
                        model.addRow(Row);
                    }
                    int rowcount = model.getRowCount();
                    System.out.println(rowcount);
                    if(rowcount==0)
                    {
                        String NoRow[];
                        NoRow = new String[7];
                        NoRow[1]="NO";
                        NoRow[2]="RESULT";
                        NoRow[0]="";
                        NoRow[3]="";
                        NoRow[4]="";
                        NoRow[5]="";
                        NoRow[6]="";
                        model.addRow(NoRow);

                    }

                    //count++;

                    Con.close();
                }catch(Exception e){System.out.println(e);
                }
            }

            else
            {

                JOptionPane.showMessageDialog(AllStudent1.this, "Select Name or Email","No Selection!", JOptionPane.ERROR_MESSAGE);
            }

            /*   Column = new String[colnum];
            for(int i=1;i<=colnum;i++){
                Column[i-1]=rsmd.getColumnClassName(i);
            }
            rs.last();

            int rows=rs.getRow();
            rs.beforeFirst();

            String[][] data = new String[rows][colnum];

            int count=0; */
    }//GEN-LAST:event_SearchActionPerformed

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void NameRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameRadioActionPerformed
        // TODO add your handling code here:
        AuthorRadio.setSelected(false);
        ALL.setSelected(false);
    }//GEN-LAST:event_NameRadioActionPerformed

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
            java.util.logging.Logger.getLogger(AllStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AllStudent1().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AllStudent1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ALL;
    private javax.swing.JRadioButton AuthorRadio;
    private javax.swing.JRadioButton NameRadio;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SearchField;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}
