package tz.go.bot.jdbc;

import java.sql.*;

public class JdbcBoilerPlate {
	
	public static void main(String[] args) {
		
		String url="jdbc:postgresql://localhost:5432/bot";
		String username="postgres";
		String password="admin";
		
		Connection con=null;
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			
			con=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established Successfully");
//			Write the actual query
			String query="";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			//PreparedStatement Setters
			//Execute the Query
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
