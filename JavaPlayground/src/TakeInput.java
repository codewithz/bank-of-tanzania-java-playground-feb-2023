import java.util.Scanner;

public class TakeInput {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Your Name:");
		String name=sc.next();
		
		System.out.print("Enter Your Age:");
		int age=sc.nextInt();
		
		System.out.println(name+"--"+age);
		
	}

}
