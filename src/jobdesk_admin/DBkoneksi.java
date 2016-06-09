/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobdesk_admin;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PCSundaya
 */
public class DBkoneksi {
    public Connection connect = null;
	
	public void ConDb() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		// Setup the connection with the DB

		String urlcon = "jdbc:mysql://192.168.2.124:3306/jobdb";
//		String user = "root";
//		String pwd = "asusa45v";
		String user = "mrsjane";
		String pwd = "mrsjane123";
		connect = DriverManager.getConnection(urlcon, user, pwd);

	
		
	}
}
