package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2Statement {
	
	public static void main(String[] args) {
		
		String url = "jdbc:derby://localhost:1527/db1;create=true";
		
		try(Connection con = DriverManager.getConnection(url);) {
			System.out.println("connected to " + url);
			Statement stmt = con.createStatement();
			String sql = "insert into students values(102, 'Sarrah', 26)";
			stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
