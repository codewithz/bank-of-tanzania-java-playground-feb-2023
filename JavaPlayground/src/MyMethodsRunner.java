
public class MyMethodsRunner {

	public static void main(String[] args) {
		
		MyMethods obj=new MyMethods();
		obj.display();
		obj.add(1, 2);
		int tax=obj.getTaxRate();
		System.out.println("Tax:"+tax);
		int square=obj.squareNumber(5);
		System.out.println("Square is:"+square);
		
	}
}
