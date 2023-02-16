package tz.go.bot.jdbc;

import java.sql.*;
import java.time.LocalDate;

public class UpdateCustomer {
	
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
			String query="Update customer set contact=? where id=?";
	
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			//PreparedStatement Setters
			long contact=991122334;
			int id=1;
			
			pstmt.setLong(1, contact);
			pstmt.setInt(2, id);	
			//Execute the Query
			int rowUpdated=pstmt.executeUpdate();
			
			System.out.println("No of Rows Updated: "+rowUpdated);
			
			
			
			
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
