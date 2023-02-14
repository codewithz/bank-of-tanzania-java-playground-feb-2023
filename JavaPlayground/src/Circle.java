
public class Circle {
	
	int radius;
	
	Circle(int radius){
		this.radius=radius;
	}
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
	public void calculateArea() {
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle is "+area);
	}

}
