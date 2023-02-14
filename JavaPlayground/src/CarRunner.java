
public class CarRunner {
	
	public static void main(String[] args) {
		
		Car c=new Car();
		
		System.out.println(c.name);
		System.out.println(c.fuelLevel);
		c.run();
		
		System.out.println(c.r.volume);
		c.r.play();
		
	}

}
