package tz.go.bot.jdbc;

import java.sql.*;

public class TestConnection {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url="jdbc:postgresql://localhost:5432/bot";
			String username="postgres";
			String password="admin";
			
			Connection con=DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection Established Successfully.");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
