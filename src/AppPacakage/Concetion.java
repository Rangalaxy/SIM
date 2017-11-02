/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPacakage;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ran
 */
 class NewClass
{
    String pass = "Ranjeet";
public static void main(String args[]) throws InterruptedException
  {
      try{  

          Thread.sleep(5000);
          Class.forName("com.mysql.jdbc.Driver");  
          Connection con=(Connection) DriverManager.getConnection(  
          "jdbc:mysql://localhost:3306/SIM","root","student"); 
          
          
          
       
      
           java.awt.EventQueue.invokeLater(() -> {
               new AppPacakage.Connect().setVisible(true);
          });
             
      }
      
 
      catch(ClassNotFoundException | SQLException e){ 
    
    try
{


            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=(Connection) DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/","root","ranjeet");  
            Statement stmt = (Statement) con.createStatement();
            String sql = "create Database SIM;";
            String a = "Use SIM";
            String b ="create table school (Admission Varchar(20),Studentname Varchar(30),Rollno Varchar(20),Fathername Varchar(30),Mothername Varchar(30),Contactnumber Varchar(12),Mode Varchar(20),Address Varchar(50),Class Varchar(20),Sec Varchar(10),House Varchar(10),Blood Varchar(20),Gender Varchar(20),Studentphoto longblob,birthday  varchar(20),admissiondate varchar(20));";
            String c ="Create table admin (SerialNo varchar(4),UserName varchar(20),Password varchar(20),MobileNo varchar(12),Email varchar(25));";
            String d ="insert into admin(SerialNo,UserName,Password,MobileNo,Email)values('1','Teacher','Teacher','123456789','Tea@APS.Com');";
            stmt.executeUpdate(sql);
            stmt.executeUpdate(a);
            stmt.executeUpdate(b);
            stmt.executeUpdate(c);
            stmt.executeUpdate(d);
            
            
            
            
            
  try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
              
                }
            }
        } catch (ClassNotFoundException ex) {
           
}            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
          
           java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppPacakage.Server().setVisible(true);
            }
             });



}
catch(Exception E)
{                

JOptionPane.showMessageDialog(null, E.getMessage());

}
   

}  
}  
} 
 
        
      