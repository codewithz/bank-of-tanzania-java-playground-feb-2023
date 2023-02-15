package tz.go.bot.exceptions;

public class SquareRunnerTE {
	
	public static void main(String[] args) throws SquareException {
		
		Square sq=new Square();
		
		sq.setLength(-12);
		
		System.out.println(sq.getLength());
		
		System.out.println("---------I am after the exception occurred------");
		
	}

}
