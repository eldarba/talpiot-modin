package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3Select {
	
	public static void main(String[] args) {
		
		String url = "jdbc:derby://localhost:1527/db1";
		
		try(Connection con = DriverManager.getConnection(url);) {
			System.out.println("connected to " + url);
			Statement stmt = con.createStatement();
			String sql = "select * from students";
			// ResultSet is the result of select
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				// each iteration is a current line
				System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getInt("age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
