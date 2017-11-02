/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPacakage;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ran
 */
public class StudentView_Delete extends javax.swing.JFrame {
 String number;
 
    /**
     * Creates new form StudentView_Delete
     */
    public StudentView_Delete() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Admission Num", " AdmissionDate", "Student Name", "Roll-No", "Class", "Section", "Gender", "Father Name", "Mother Name", "Birthday", "House", "Contact No", "Mode of Trans", "Blood Group", "Address", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setOpaque(false);
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(15).setResizable(false);
        }

        jToolBar1.setRollover(true);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("View");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        jMenuItem2.setText("Reset Table");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem8.setText("Close");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Print");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Delete");
        jMenu2.setPreferredSize(new java.awt.Dimension(41, 12));

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setText("By Admission Number");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setText("By Name");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem5.setText("By Roll-No");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sort ");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("By Descending Order");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("By Aescending Order");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);
        jMenu3.add(jSeparator1);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("By Class");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("By House");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("By Gender");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyTyped

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)
        jTable1.getModel();

        try
        {

            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/SIM","root","student");
            Statement stmt = (Statement) con.createStatement();
            String query = "Select * From  school;";
            ResultSet rs = stmt.executeQuery(query);
            
            
             int rows = model.getRowCount();
        if(rows>0)
        {
        for(int i = 0; i<rows;i++)
        model.removeRow(0);
        
        }
            
            

            while(rs.next())

            {
                String admissionnumber   = rs.getString("Admission");
                String Studentname   =  rs.getString("Studentname");
                String Rollno        =  rs.getString("Rollno");
                String Fathername    =  rs.getString("Fathername");
                String Mothername    =  rs.getString("Mothername");
                String Contactnumber =  rs.getString("Contactnumber");
                String Mode          =  rs.getString("Mode");
                String Address       =  rs.getString("Address");
                String Class         =  rs.getString("Class");
                String Sec           =  rs.getString("Sec");
                String House         =  rs.getString("House");
                String Blood         =  rs.getString("Blood");
                String Gender        =  rs.getString("Gender");
                String birthday      =  rs.getString("birthday");
                String Admissiondate =  rs.getString("admissiondate");
                byte[] studentphoto = rs.getBytes("Studentphoto");
                
                
                
                
                
                
               

                model.addRow (new Object[]

                    {
                        admissionnumber,Admissiondate,Studentname,Rollno,Class,Sec ,Gender,Fathername,Mothername,birthday ,House,Contactnumber,Mode,Blood,Address,studentphoto

                    }

                );

            }

        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         String Admissionno;
                Admissionno = JOptionPane.showInputDialog("Enter The Admission Number",JOptionPane.YES_NO_OPTION);              

              
       if(Admissionno.isEmpty()) 
           JOptionPane.showMessageDialog(this, "No Admssion Number Is Entered");

       else    
    
        try
        {

            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/SIM","root","student");
            Statement stmt = (Statement) con.createStatement();
            
            String query ="Select Admission From school where Admission ='"+Admissionno+"';";
 
            ResultSet rs =stmt.executeQuery(query);
            
            if(rs.next())
            {    
           query = "delete from school where Admission = '"+Admissionno+"';";
           stmt.execute(query); 
           JOptionPane.showMessageDialog(this,"Student Detail Having This Admission Number is Deleted");  

        DefaultTableModel model = (DefaultTableModel)
        jTable1.getModel();
        
        int rows = model.getRowCount();
        if(rows>0)
        {
        for(int i = 0; i<rows;i++)
        model.removeRow(0);
        
        }
           
           
        query = "Select * From  school;";
        rs = stmt.executeQuery(query);

            while(rs.next())

            {
                String admissionnumber   = rs.getString("Admission");
                String Studentname   =  rs.getString("Studentname");
                String Rollno        =  rs.getString("Rollno");
                String Fathername    =  rs.getString("Fathername");
                String Mothername    =  rs.getString("Mothername");
                String Contactnumber =  rs.getString("Contactnumber");
                String Mode          =  rs.getString("Mode");
                String Address       =  rs.getString("Address");
                String Class         =  rs.getString("Class");
                String Sec           =  rs.getString("Sec");
                String House         =  rs.getString("House");
                String Blood         =  rs.getString("Blood");
                String Gender        =  rs.getString("Gender");
                String birthday      =  rs.getString("birthday");
                String Admissiondate =  rs.getString("admissiondate");
                byte[] studentphoto = rs.getBytes("Studentphoto");

                model.addRow (new Object[]

                    {
                        admissionnumber,Admissiondate,Studentname,Rollno,Class,Sec ,Gender,Fathername,Mothername,birthday ,House,Contactnumber,Mode,Blood,Address,studentphoto

                    }

                );
                
                
              
                
                
                
                
                
                
                

            }
   
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
         }
            else
                JOptionPane.showMessageDialog(this,"Admisson Number Does Not Exit,Please Enter Correct Admission Number");
         
           
           
            
        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(this, e.getMessage());

        }        
            
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)
        jTable1.getModel();
        
        int rows = model.getRowCount();
        if(rows>0)
        {
        for(int i = 0; i<rows;i++)
        model.removeRow(0);
        
        }
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        String StudentName;
                StudentName = JOptionPane.showInputDialog("Enter The Student Name",JOptionPane.YES_NO_OPTION);              

              
       if(StudentName.isEmpty()) 
           JOptionPane.showMessageDialog(this, "No Student Name Is Entered");

       else    
    
        try
        {

            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/SIM","root","student");
            Statement stmt = (Statement) con.createStatement();
            
            String query ="Select Admission From school where Studentname ='"+StudentName+"';";
 
            ResultSet rs =stmt.executeQuery(query);
            
            if(rs.next())
            {    
           query = "delete from school where Studentname = '"+StudentName+"';";
           stmt.execute(query); 
           JOptionPane.showMessageDialog(this,"Student Detail Having This Admission Number is Deleted");  
           
           DefaultTableModel model = (DefaultTableModel)
            jTable1.getModel();
        
        int rows = model.getRowCount();
        if(rows>0)
        {
        for(int i = 0; i<rows;i++)
        model.removeRow(0);
        
        }
           
           
        query = "Select * From  school;";
        rs = stmt.executeQuery(query);

            while(rs.next())

            {
                String admissionnumber   = rs.getString("Admission");
                String Studentname   =  rs.getString("Studentname");
                String Rollno        =  rs.getString("Rollno");
                String Fathername    =  rs.getString("Fathername");
                String Mothername    =  rs.getString("Mothername");
                String Contactnumber =  rs.getString("Contactnumber");
                String Mode          =  rs.getString("Mode");
                String Address       =  rs.getString("Address");
                String Class         =  rs.getString("Class");
                String Sec           =  rs.getString("Sec");
                String House         =  rs.getString("House");
                String Blood         =  rs.getString("Blood");
                String Gender        =  rs.getString("Gender");
                String birthday      =  rs.getString("birthday");
                String Admissiondate =  rs.getString("admissiondate");
                byte[] studentphoto = rs.getBytes("Studentphoto");

                model.addRow (new Object[]

                    {
                        admissionnumber,Admissiondate,Studentname,Rollno,Class,Sec ,Gender,Fathername,Mothername,birthday ,House,Contactnumber,Mode,Blood,Address,studentphoto

                    }

                );
                
                
                
                
                
                
                
                
                
                

            }
           
           
           
           
           
           

         }
            else
                JOptionPane.showMessageDialog(this,"No Student Having This Name,Please Enter Name To Delete The Data");
         
           
           
            
        }
        catch(ClassNotFoundException | SQLException | HeadlessException e)
        {

            JOptionPane.showMessageDialog(this, e.getMessage());

        }        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
            String RollNo;
                RollNo = JOptionPane.showInputDialog("Enter The Roll Number",JOptionPane.YES_NO_OPTION);              

              
       if(RollNo.isEmpty()) 
           JOptionPane.showMessageDialog(this, "No Roll Number Is Entered");

       else    
    
        try
        {

            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/SIM","root","student");
            Statement stmt = (Statement) con.createStatement();
            
            String query ="Select Admission From school where Rollno ='"+RollNo+"';";
 
            ResultSet rs =stmt.executeQuery(query);
            
            if(rs.next())
            {    
           query = "delete from school where Rollno = '"+RollNo+"';";
           stmt.execute(query); 
           JOptionPane.showMessageDialog(this,"Student Detail Having This Roll  Number is Deleted");  
           
           
           
           
           DefaultTableModel model = (DefaultTableModel)
           jTable1.getModel();
        
        int rows = model.getRowCount();
        if(rows>0)
        {
        for(int i = 0; i<rows;i++)
        model.removeRow(0);
        
        }
           
           
        query = "Select * From  school;";
        rs = stmt.executeQuery(query);

            while(rs.next())

            {
                String admissionnumber   = rs.getString("Admission");
                String Studentname   =  rs.getString("Studentname");
                String Rollno        =  rs.getString("Rollno");
                String Fathername    =  rs.getString("Fathername");
                String Mothername    =  rs.getString("Mothername");
                String Contactnumber =  rs.getString("Contactnumber");
                String Mode          =  rs.getString("Mode");
                String Address       =  rs.getString("Address");
                String Class         =  rs.getString("Class");
                String Sec           =  rs.getString("Sec");
                String House         =  rs.getString("House");
                String Blood         =  rs.getString("Blood");
                String Gender        =  rs.getString("Gender");
                String birthday      =  rs.getString("birthday");
                String Admissiondate =  rs.getString("admissiondate");
                byte[] studentphoto = rs.getBytes("Studentphoto");

                model.addRow (new Object[]

                    {
                        admissionnumber,Admissiondate,Studentname,Rollno,Class,Sec ,Gender,Fathername,Mothername,birthday ,House,Contactnumber,Mode,Blood,Address,studentphoto

                    }

                );
                
                
                
                
                
                
                
                
                
                

            }

         }
            else
                JOptionPane.showMessageDialog(this,"No Student Having This Roll-No,Please Enter Correct Roll-No To Delete The Data");
         
           
           
            
        }
        catch(Exception e)
        {

            JOptionPane.showMessageDialog(this, e.getMessage());

        }  
       
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        try
        {

            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/SIM","root","student");
            Statement stmt = (Statement) con.createStatement();
            
            String query ="Select * From school order by Studentname ASC;";
 
            ResultSet rs =stmt.executeQuery(query);
            
          
    
           DefaultTableModel model = (DefaultTableModel)
           jTable1.getModel();
           int rows = model.getRowCount();
        if(rows>0)
        {
        for(int i = 0; i<rows;i++)
        model.removeRow(0);
        
        }
            while(rs.next())

            {
                String admissionnumber   = rs.getString("Admission");
                String Studentname   =  rs.getString("Studentname");
                String Rollno        =  rs.getString("Rollno");
                String Fathername    =  rs.getString("Fathername");
                String Mothername    =  rs.getString("Mothername");
                String Contactnumber =  rs.getString("Contactnumber");
                String Mode          =  rs.getString("Mode");
                String Address       =  rs.getString("Address");
                String Class         =  rs.getString("Class");
                String Sec           =  rs.getString("Sec");
                String House         =  rs.getString("House");
                String Blood         =  rs.getString("Blood");
                String Gender        =  rs.getString("Gender");
                String birthday      =  rs.getString("birthday");
                String Admissiondate =  rs.getString("admissiondate");
                byte[] studentphoto = rs.getBytes("Studentphoto");

                model.addRow (new Object[]

                    {
                        admissionnumber,Admissiondate,Studentname,Rollno,Class,Sec ,Gender,Fathername,Mothername,birthday ,House,Contactnumber,Mode,Blood,Address,studentphoto

                    }

                );
                
                
       
                
                
                
                
                
                
                

            }

         
        }
         catch(Exception e)
         {
         
         JOptionPane.showMessageDialog(this, e.getMessage());
         
         }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         try
        {

            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/SIM","root","student");
            Statement stmt = (Statement) con.createStatement();
            
            String query ="Select * From school order by Studentname DESC;";
 
            ResultSet rs =stmt.executeQuery(query);
            
          
    
           DefaultTableModel model = (DefaultTableModel)
           jTable1.getModel();
           int rows = model.getRowCount();
        if(rows>0)
        {
        for(int i = 0; i<rows;i++)
        model.removeRow(0);
        
        }
            while(rs.next())

            {
                String admissionnumber   = rs.getString("Admission");
                String Studentname   =  rs.getString("Studentname");
                String Rollno        =  rs.getString("Rollno");
                String Fathername    =  rs.getString("Fathername");
                String Mothername    =  rs.getString("Mothername");
                String Contactnumber =  rs.getString("Contactnumber");
                String Mode          =  rs.getString("Mode");
                String Address       =  rs.getString("Address");
                String Class         =  rs.getString("Class");
                String Sec           =  rs.getString("Sec");
                String House         =  rs.getString("House");
                String Blood         =  rs.getString("Blood");
                String Gender        =  rs.getString("Gender");
                String birthday      =  rs.getString("birthday");
                String Admissiondate =  rs.getString("admissiondate");
                byte[] studentphoto = rs.getBytes("Studentphoto");

                model.addRow (new Object[]

                    {
                        admissionnumber,Admissiondate,Studentname,Rollno,Class,Sec ,Gender,Fathername,Mothername,birthday ,House,Contactnumber,Mode,Blood,Address,studentphoto

                    }

                );
                
                
       
                
                
                
                
                
                
                

            }

         
        }
         catch(Exception e)
         {
         
         JOptionPane.showMessageDialog(this, e.getMessage());
         
         }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        new StudentHOme().setVisible(true);
        this.dispose();

        JOptionPane.showMessageDialog(this,"Log Out Sucessfully");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
         MessageFormat  header  =  new MessageFormat("Student Details");
        MessageFormat  footer = new MessageFormat("Page{0,number,integer}");
        try{
            
          jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        
        
        
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        String Classs;
        Classs = JOptionPane.showInputDialog("Enter The Class In Roman Numbers",JOptionPane.YES_NO_OPTION);
        
        if (Classs.isEmpty())
        {   JOptionPane.showMessageDialog(this, "Please Enter Class In Roman Numbers");
           
        }
            else
        
          try
        {

            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/SIM","root","ranjeet");
            Statement stmt = (Statement) con.createStatement();
            
            String query ="Select * From school where Class = '"+Classs+"' ;";
 
            ResultSet rs =stmt.executeQuery(query);
            
          
    
           DefaultTableModel model = (DefaultTableModel)
           jTable1.getModel();
           int rows = model.getRowCount();
        if(rows>0)
        {
        for(int i = 0; i<rows;i++)
        model.removeRow(0);
        
        }
            while(rs.next())

            {
                String admissionnumber   = rs.getString("Admission");
                String Studentname   =  rs.getString("Studentname");
                String Rollno        =  rs.getString("Rollno");
                String Fathername    =  rs.getString("Fathername");
                String Mothername    =  rs.getString("Mothername");
                String Contactnumber =  rs.getString("Contactnumber");
                String Mode          =  rs.getString("Mode");
                String Address       =  rs.getString("Address");
                String Class         =  rs.getString("Class");
                String Sec           =  rs.getString("Sec");
                String House         =  rs.getString("House");
                String Blood         =  rs.getString("Blood");
                String Gender        =  rs.getString("Gender");
                String birthday      =  rs.getString("birthday");
                String Admissiondate =  rs.getString("admissiondate");
                byte[] studentphoto = rs.getBytes("Studentphoto");

                model.addRow (new Object[]

                    {
                        admissionnumber,Admissiondate,Studentname,Rollno,Class,Sec ,Gender,Fathername,Mothername,birthday ,House,Contactnumber,Mode,Blood,Address,studentphoto

                    }

                );
            }
        }
          
          catch(Exception e)
          {
          JOptionPane.showMessageDialog(this, e.getMessage());
          }
          
          
          
          
          
          
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        String Classs;
        Classs = JOptionPane.showInputDialog("Enter The House",JOptionPane.YES_NO_OPTION);
        
        if (Classs.isEmpty())
            JOptionPane.showMessageDialog(this, "Please Enter The House Name");
        
        else
        
          try
        {

            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/SIM","root","student");
            Statement stmt = (Statement) con.createStatement();
            
            String query ="Select * From school where House = '"+Classs+"' ;";
 
            ResultSet rs =stmt.executeQuery(query);
            
          
    
           DefaultTableModel model = (DefaultTableModel)
           jTable1.getModel();
           int rows = model.getRowCount();
        if(rows>0)
        {
        for(int i = 0; i<rows;i++)
        model.removeRow(0);
        
        }
            while(rs.next())

            {
                String admissionnumber   = rs.getString("Admission");
                String Studentname   =  rs.getString("Studentname");
                String Rollno        =  rs.getString("Rollno");
                String Fathername    =  rs.getString("Fathername");
                String Mothername    =  rs.getString("Mothername");
                String Contactnumber =  rs.getString("Contactnumber");
                String Mode          =  rs.getString("Mode");
                String Address       =  rs.getString("Address");
                String Class         =  rs.getString("Class");
                String Sec           =  rs.getString("Sec");
                String House         =  rs.getString("House");
                String Blood         =  rs.getString("Blood");
                String Gender        =  rs.getString("Gender");
                String birthday      =  rs.getString("birthday");
                String Admissiondate =  rs.getString("admissiondate");
                byte[] studentphoto = rs.getBytes("Studentphoto");

                model.addRow (new Object[]

                    {
                        admissionnumber,Admissiondate,Studentname,Rollno,Class,Sec ,Gender,Fathername,Mothername,birthday ,House,Contactnumber,Mode,Blood,Address,studentphoto

                    }

                );
            }
        }
          
          catch(Exception e)
          {
          JOptionPane.showMessageDialog(this, e.getMessage());
          }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentView_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentView_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentView_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentView_Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
