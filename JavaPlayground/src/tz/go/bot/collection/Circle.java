package tz.go.bot.collection;

public class Circle {
	
	private int radius;
	
	Circle(int radius){
		this.radius=radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double calcualeArea() {
		double area=Math.PI*radius*radius;
		return area;
	}
	
	public String toString() {
		return "Circle - radius:"+radius;
	}

}
