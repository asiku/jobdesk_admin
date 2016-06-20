/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobdesk_admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PCSundaya
 */
public class DBkoneksi {
    public Connection connect = null;
	
	public void ConDb(){
	try {
          
              Class.forName("com.mysql.jdbc.Driver");
            
		String urlcon = "jdbc:mysql://192.168.2.124:3306/jobdb";

		String user = "mrsjane";
		String pwd = "mrsjane123";
            try {
                connect = DriverManager.getConnection(urlcon, user, pwd);
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "2 err! :"+ex);
                Logger.getLogger(DBkoneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error! :"+ex);
            Logger.getLogger(DBkoneksi.class.getName()).log(Level.SEVERE, null, ex);
        }

	
		
	}
}
