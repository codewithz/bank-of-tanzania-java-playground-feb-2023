package tz.go.bot.reflection;

public class ReflectionRunner {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//reflect a class using java.lang.Class
		
		//Way 1: using forName()
		
		Class dogA=Class.forName("tz.go.bot.reflection.Dog");
		System.out.println("Way 1: using forName()");
		System.out.println(dogA.getCanonicalName());
		
		
		//Way 2
		Dog dog=new Dog();
		
		Class dogB=dog.getClass();
		System.out.println("Way 2: using getClass()");
		System.out.println(dogB.getCanonicalName());
		
		//Way 3
		Class dogC=Dog.class;
		System.out.println("Way 3: using .class");
		System.out.println(dogC.getCanonicalName());
		
	}

}
