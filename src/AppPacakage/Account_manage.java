/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPacakage;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ran
 */
public class Account_manage extends javax.swing.JFrame {
int xmouse;
int ymouse;
    /**
     * Creates new form AdminUpdate
     */
    public Account_manage() {
        initComponents();
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jPasswordField1.setEditable(false);
        jButton2.setEnabled(false);
        jButton2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        close = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        movingbar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 60, 40));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 270, 40));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 270, 50));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 270, 40));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 270, 40));

        close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        close.setForeground(new java.awt.Color(153, 153, 153));
        close.setText("X");
        close.setToolTipText("close");
        close.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                closeMouseMoved(evt);
            }
        });
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 20, 20));

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 90, 50));

        jButton1.setText("Fecth");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 110, 50));

        jButton2.setText("Save");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 100, 40));

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 110, 50));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Admi detail.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        movingbar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        movingbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingbarMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                movingbarMouseMoved(evt);
            }
        });
        movingbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingbarMousePressed(evt);
            }
        });
        getContentPane().add(movingbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
        
         Class.forName("java.sql.DriverManager");
         Connection con =(Connection)
         DriverManager.getConnection("jdbc:mysql://localhost:3306/SIM","root","student");
         Statement stmt =(Statement) con.createStatement();
         String query = "Select * from admin;";
         ResultSet rs=stmt.executeQuery(query);
         
         if(rs.next())
         { String serial = rs.getString("SerialNo");
         String username = rs.getString("UserName"); 
         String password = rs.getString("Password");
         String mobile   = rs.getString("MobileNO");
         String email  = rs.getString("Email");
         
         
          jTextField1.setText(serial);
          jTextField2.setText(username );
          jPasswordField1.setText(password);
          jTextField4.setText(mobile);
          jTextField5.setText(email);
          
         }
         else
         {JOptionPane.showMessageDialog(this, "mmmm");}
        
        
        }
        catch(Exception e)
        {
        
        JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        jTextField2.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextField1.setEditable(false);
        jTextField2.setEditable(true);
        jTextField4.setEditable(true);
        jTextField5.setEditable(true);
        jPasswordField1.setEditable(true);
        jButton2.setEnabled(true);
        jButton2.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String serial = jTextField1.getText();
         String username = jTextField2.getText(); 
         String password = jPasswordField1.getText();
         String mobile   = jTextField4.getText();
         String email  =jTextField5.getText();    

         
         if(serial.isEmpty() ||
            username.isEmpty()||
            password.isEmpty()||
            mobile .isEmpty() || email.isEmpty() )
             
        JOptionPane.showMessageDialog(this,"Please Fill the Details");
         
         
         else
             try
            {
         
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ran","root","student");
       
        String sql = "update admin set SerialNO ='"+serial+"',UserName='"+username+"',Password='"+password+"',MobileNO='"+mobile+"',Email='"+email+"';";  
         
        Statement stmt=  (Statement)  con.createStatement();
        
        stmt.execute(sql);
        
        JOptionPane.showMessageDialog(null, "Information Updated");
        
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jPasswordField1.setEditable(false);
        
        
        
            
            }
        
           
         
           catch(Exception e)
           {
           JOptionPane.showMessageDialog(this, e.getMessage());
           }
        
         
         
         
         
         
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void closeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseMoved
        // TODO add your handling code here:
        close.setForeground(new java.awt.Color(204,255,102));
    }//GEN-LAST:event_closeMouseMoved

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        // TODO add your handling code here:[255,51,51]
         close.setForeground(new java.awt.Color(255,51,51));
          new StudentHOme().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeMousePressed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void movingbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingbarMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xmouse , y-ymouse);
    }//GEN-LAST:event_movingbarMouseDragged

    private void movingbarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingbarMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_movingbarMouseMoved

    private void movingbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingbarMousePressed
        // TODO add your handling code here:
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_movingbarMousePressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Account_manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account_manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account_manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account_manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account_manage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel movingbar;
    // End of variables declaration//GEN-END:variables
}