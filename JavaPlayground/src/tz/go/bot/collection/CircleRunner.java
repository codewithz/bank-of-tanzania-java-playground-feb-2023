package tz.go.bot.collection;

public class CircleRunner {
	
	public static void main(String[] args) {
		
		Circle c=new Circle(10);
		System.out.println(c);
		System.out.println(c.toString());
		System.out.println("--------------------------");
		int hashCode=c.hashCode();
		System.out.println(hashCode);
		String hexOfHash=Integer.toHexString(hashCode);
		System.out.println(hexOfHash);
	}

}
