
public class Pen {

	Pen(){
		System.out.println("Calling default constructor of Pen");
	}
	
	Pen(String color){
		System.out.println("Calling Parameterized Constructor");
	}
	
	public void openCap() {
		System.out.println("Open Cap of Pen");
	}
	
	public void write() {
		System.out.println("Write of Pen");
	}
	
	public void closeCap() {
		System.out.println("Close Cap of Pen");
	}

}
