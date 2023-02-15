package tz.go.bot.exceptions;

public class Square {
	
	private int length;

	public int getLength() {
		return length;
	}
	//throws -- notifies others that this method can throw an exception
	//throw -- throws the actual exception
	public void setLength(int length) throws SquareException {
		if(length<1) {
			throw new SquareException("Lenght cannot be 0 or less");
		}
		else {
		this.length = length;
		}
	}
	
	
	
	

}
