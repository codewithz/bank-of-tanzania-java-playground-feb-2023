
public class VehicleRunner {
	
	public static void main(String[] args) {
		
		Vehicle v;
		v=new Vehicle();
		String name=v.getName();
		System.out.println(name);
		
		String name1=Vehicle.getName();
		System.out.println(name1);
		
	}
}
