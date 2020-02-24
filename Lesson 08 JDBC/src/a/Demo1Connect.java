package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1Connect {
	
	public static void main(String[] args) {
		
		String url = "jdbc:derby://localhost:1527/db1;create=true";
		
		try(Connection con = DriverManager.getConnection(url);) {
			System.out.println("connected to " + url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
