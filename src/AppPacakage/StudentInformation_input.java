package AppPacakage;


import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ran
 */
public class StudentInformation_input extends javax.swing.JFrame {
       int xmouse;
          int ymouse;
          File f;      
    /**
     * Creates new form StudentInformation_input
     */
    public StudentInformation_input() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jclosebutton = new javax.swing.JButton();
        birthday = new com.toedter.calendar.JDateChooser();
        classbox = new javax.swing.JComboBox<>();
        section = new javax.swing.JComboBox<>();
        blood = new javax.swing.JComboBox<>();
        admissiondate = new com.toedter.calendar.JDateChooser();
        transportation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        student = new javax.swing.JTextField();
        admission = new javax.swing.JTextField();
        rollnumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        house = new javax.swing.JComboBox<>();
        father = new javax.swing.JTextField();
        mother = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        contact = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        moving = new javax.swing.JLabel();
        backgroundimage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jclosebutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jclosebutton.setForeground(new java.awt.Color(204, 204, 204));
        jclosebutton.setText("X");
        jclosebutton.setToolTipText("close");
        jclosebutton.setBorderPainted(false);
        jclosebutton.setContentAreaFilled(false);
        jclosebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jclosebutton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jclosebuttonMouseMoved(evt);
            }
        });
        jclosebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclosebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(jclosebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 10, -1, 30));

        birthday.setDateFormatString("d-MMM-yyyy");
        getContentPane().add(birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 190, 30));

        classbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "I", "II", "III", "IV", "V", "VI", "VII", "VII", "IX", "X", "XI", "XII" }));
        getContentPane().add(classbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 80, -1));

        section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A", "B", "C", "D", "E", "F", "G", "H" }));
        getContentPane().add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 180, 70, -1));

        blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "O-", "O+", "A-", "A+", "B-", "B+", "AB-", "AB+" }));
        getContentPane().add(blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 100, -1));

        admissiondate.setDateFormatString("d-MMM-yyyy");
        getContentPane().add(admissiondate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 140, -1));
        getContentPane().add(transportation, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 190, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Date of Admission");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 120, 20));

        add.setText("Add Photo");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 140, 50));
        getContentPane().add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 190, 30));
        getContentPane().add(admission, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 190, 30));
        getContentPane().add(rollnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 190, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 90, -1));

        house.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Blue", "Green", "Red", "Yellow" }));
        getContentPane().add(house, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 130, -1));
        getContentPane().add(father, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 190, 30));
        getContentPane().add(mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 190, 30));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Other" }));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 120, -1));
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 190, 30));

        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 60, 190, 240));

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 680, 140, 50));

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, 140, 50));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, 240, 100));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setText("-");
        jButton4.setToolTipText("minimize");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton4MouseMoved(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 10, -1, 30));

        moving.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movingMouseDragged(evt);
            }
        });
        moving.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movingMousePressed(evt);
            }
        });
        getContentPane().add(moving, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 760, 30));

        backgroundimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addstudent_1.png"))); // NOI18N
        getContentPane().add(backgroundimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void movingMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xmouse , y-ymouse);
    }//GEN-LAST:event_movingMouseDragged

    private void movingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movingMousePressed
        // TODO add your handling code here:
        xmouse=evt.getX();
        ymouse=evt.getY();
    }//GEN-LAST:event_movingMousePressed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(this);
        f = fc.getSelectedFile();
        String path = f.getAbsolutePath();
       
            if(res==JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            ImageIcon Studentphoto = new ImageIcon(file.getAbsolutePath());
            Rectangle rect = jLabel1.getBounds();
               
            Image scaledimage = Studentphoto.getImage().getScaledInstance(rect.width, rect.height,Image.SCALE_DEFAULT);
            Studentphoto= new ImageIcon(scaledimage);
            jLabel1.setIcon(Studentphoto);
            
       
        }
        else
            JOptionPane.showMessageDialog(this,"Image Not Selected");
    }//GEN-LAST:event_addActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String Admission = admission.getText();
        String Studentname = student.getText();
        String Rollno  =    rollnumber.getText();
        String Fathername = father.getText();
        String Mothername = mother.getText();
        String Contactnumber = contact.getText();
        String Mode         =  transportation.getText();
        String Address      =  address.getText();
        String Class        =   classbox.getSelectedItem().toString();
        String Sec          =    section.getSelectedItem().toString();
        String House       =  house.getSelectedItem().toString();
        String Blood        =   blood.getSelectedItem().toString();
        String Gender       =  gender.getSelectedItem().toString();
        
        
        
        if(Admission.isEmpty())
            JOptionPane.showMessageDialog(this,"Please  Enter Admission Number");
        
        else if(Studentname.isEmpty())
            JOptionPane.showMessageDialog(this,"Please  Enter Student Name ");
        else if (Rollno.isEmpty())
            JOptionPane.showMessageDialog(this,"Please  Enter Rollno");
        else if (House.isEmpty())
            JOptionPane.showMessageDialog(this,"Please Select House ");
        else if (Fathername.isEmpty())
            JOptionPane.showMessageDialog(this,"Please Enter Father Name");
        else if (Mothername.isEmpty())
            JOptionPane.showMessageDialog(this,"Please Enter Mother Name ");
        else if(Contactnumber.isEmpty())
            JOptionPane.showMessageDialog(this,"Please Enter Contact Number");
        else if (Mode.isEmpty())
            JOptionPane.showMessageDialog(this,"Please Enter Mode Of Transportation Details");
        else if (Address.isEmpty())
            JOptionPane.showMessageDialog(this,"Please Enter Address Details");
        else if (classbox.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(this,"Please  Select Class");
        else if (section.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(this,"Please Select Section");
        else if (blood.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(this,"Please Select Blood Group");
        else if (gender.getSelectedIndex()==0)
           JOptionPane.showMessageDialog(this,"Please  Select Gender");
    
        else 
            
        {
           try
            {
           FileInputStream fin = new FileInputStream(f);
             int len=(int)f.length();
            
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/SIM","root","student");
           PreparedStatement ps =con.prepareStatement("insert into school (Admission,Studentname,Rollno,Fathername,Mothername,Contactnumber,Mode,Address,Class,Sec,House,Blood,Gender,Studentphoto,birthday,admissiondate ) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
           ps.setString(1,  Admission);
           ps.setString(2,  Studentname);
           ps.setString(3,  Rollno);
           ps.setString(4,  Fathername);
           ps.setString(5,  Mothername);
           ps.setString(6,  Contactnumber);   //Contactnumber,Mode,Address,Class,Sec,House,Blood,Gender 
           ps.setString(7,  Mode);
           ps.setString(8,  Address);
           ps.setString(9,  Class);
           ps.setString(10, Sec);
           ps.setString(11, House);
           ps.setString(12, Blood);
           ps.setString(13, Gender); 
           ps.setBinaryStream(14, fin, len);
           ps.setString(15,((JTextField)birthday.getDateEditor().getUiComponent()).getText());
           ps.setString(16,((JTextField)admissiondate.getDateEditor().getUiComponent()).getText());
           int status = ps.executeUpdate();
           if(status>0)
           {
         JOptionPane.showMessageDialog(this, "Data inserted successfully");
         admission.setText("");
         student.setText("");
         rollnumber.setText("");
         father.setText("");
         mother.setText("");
         contact.setText("");
         transportation.setText("");
         address.setText("");
         classbox.setSelectedIndex(0);
         section.setSelectedIndex(0);
         house.setSelectedIndex(0);
         blood.setSelectedIndex(0);
         gender.setSelectedIndex(0);
         jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
         admissiondate.setDate(null);
         birthday.setDate(null);
           }
           else
               JOptionPane.showMessageDialog(this, " not inserted");         
           
  
            
            }
        
            catch(Exception e)     
        
            {
            
            JOptionPane.showMessageDialog(this, e.getMessage());
            
            }
                             
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
         admission.setText("");
         student.setText("");
         rollnumber.setText("");
         father.setText("");
         mother.setText("");
         contact.setText("");
         transportation.setText("");
         address.setText("");
         classbox.setSelectedIndex(0);
         section.setSelectedIndex(0);
         house.setSelectedIndex(0);
         blood.setSelectedIndex(0);
         gender.setSelectedIndex(0);
         jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        admissiondate.setDate(null);
          birthday.setDate(null);
         
    }//GEN-LAST:event_clearActionPerformed

    private void jclosebuttonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jclosebuttonMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jclosebuttonMouseMoved

    private void jclosebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclosebuttonActionPerformed
        // TODO add your handling code here:
        new StudentHOme().setVisible(true);
        this.dispose();

      
    }//GEN-LAST:event_jclosebuttonActionPerformed

    private void jButton4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseMoved

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setState(StudentInformation_input.ICONIFIED);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentInformation_input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInformation_input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInformation_input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInformation_input.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInformation_input().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField admission;
    private com.toedter.calendar.JDateChooser admissiondate;
    private javax.swing.JLabel backgroundimage;
    private com.toedter.calendar.JDateChooser birthday;
    private javax.swing.JComboBox<String> blood;
    private javax.swing.JComboBox<String> classbox;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField father;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JComboBox<String> house;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jclosebutton;
    private javax.swing.JTextField mother;
    private javax.swing.JLabel moving;
    private javax.swing.JTextField rollnumber;
    private javax.swing.JButton save;
    private javax.swing.JComboBox<String> section;
    private javax.swing.JTextField student;
    private javax.swing.JTextField transportation;
    // End of variables declaration//GEN-END:variables

    private void setText(String string) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
