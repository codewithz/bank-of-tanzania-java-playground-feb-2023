package tz.go.bot.jdbc;

import java.sql.*;
import java.time.LocalDate;

public class SelectCustomer {
	
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
			String query="Select name,contact,account_type,account_creation_date from customer";
	
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			//PreparedStatement Setters
			
				
			//Execute the Query
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				String name=rs.getString("name");
				long contact=rs.getLong("contact");
				String accountType=rs.getString("account_type");
				String dateS=rs.getString("account_creation_date");
				LocalDate date=LocalDate.parse(dateS);
				
				System.out.println("Name:"+name+"\nContact:"+contact);
				System.out.println("Account Type:"+accountType+"\nDate:"+date);
				System.out.println("------------------------------------------");
			}
			
			
			
			
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
