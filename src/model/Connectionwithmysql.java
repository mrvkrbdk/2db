package model;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Connectionwithmysql {
	public static Connection ConnDb() {
		Connection conn=null;
		try{
			 Class.forName("com.mysql.jdbc.Driver");
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/twodatabase","root","");
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
			conn= null;
		}
		return conn;

	}
}
