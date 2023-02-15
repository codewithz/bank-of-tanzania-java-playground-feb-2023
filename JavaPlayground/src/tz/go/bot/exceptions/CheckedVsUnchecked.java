package tz.go.bot.exceptions;

import java.io.*;
public class CheckedVsUnchecked {
	
	public static void main(String[] args) throws Exception {
		
		//UnChecked Exception
		String name="Tanzania";
		//String subName=name.substring(5,20);
		
		//Checked Exception
		try {
		FileReader fr=new FileReader("someFile.txt");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
			System.out.println("---------------------------------");
			
			e.printStackTrace();
		}
	}

}
