package tz.go.bot.exceptions;

public class SquareRunner {
	
	public static void main(String[] args) {
		
		Square sq=new Square();
		try {
			sq.setLength(-12);
		} catch (SquareException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sq.getLength());
		
		System.out.println("---------I am after the exception occurred------");
		
		
		
	}

}
