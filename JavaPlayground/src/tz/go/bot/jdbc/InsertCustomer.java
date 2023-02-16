package tz.go.bot.jdbc;

import java.sql.*;
import java.time.LocalDate;

public class InsertCustomer {
	
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
			String query="Insert into customer(name,contact,account_type,account_creation_date)"
					+ " values (?,?,?,?)";
	
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			//PreparedStatement Setters
			String name="John";
//			String email="tom@gmail.com";
			long contact=11223346;
			String accountType="Current";
			LocalDate date=LocalDate.now();
			
			pstmt.setString(1, name);
//			pstmt.setString(2, email);
			pstmt.setLong(2, contact);
			pstmt.setString(3, accountType);
			pstmt.setObject(4, date);
				
			//Execute the Query
			int rowInserted=pstmt.executeUpdate();
			
			System.out.println("No of Rows Inserted: "+rowInserted);;
			
			
			
			
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
