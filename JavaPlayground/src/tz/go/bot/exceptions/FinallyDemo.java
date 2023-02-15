package tz.go.bot.exceptions;

public class FinallyDemo {
	
	public static void main(String[] args) {
		
		try {
			int[] iArray=new int[] {1,2,3,4};
			System.out.println(iArray[20]);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally");
			//Close the db connection
			//CLose any other resource
		}
		
	}

}
