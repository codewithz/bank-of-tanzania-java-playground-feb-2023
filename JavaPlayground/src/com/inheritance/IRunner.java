package com.inheritance;

public class IRunner {
	
	public static void main(String[] args) {
		
		A a=new A();
		a.m1();
		a.m2();
		
		B b=new B();
		b.m3();
		b.m4();
		b.m1();
		b.m2();
		
		System.out.println("--------------- B --> A --> Object");
		
		Class c1=b.getClass();
		System.out.println("Parent Class for B is "+c1.getSuperclass().getName());
		
		Class c2=a.getClass();
		System.out.println("Parent Class for A is "+c2.getSuperclass().getName());
		
		System.out.println("----------- Constructor Chaining -----------");
		
		Z z=new Z();
		
		System.out.println("--------- Method Overriding------------");
		
		Animal a1=new Animal();
		a1.eat();
		
		Elephant e=new Elephant();
		e.eat();
		
		System.out.println("------ Rule of Generalization------------");
		
		Zoo zoo=new Zoo();
		Animal penguin=new Penguin();
		Animal lion=new Lion();
		Elephant elephant=new Elephant();
		Tiger tiger=new Tiger();
		
		zoo.storeAnimal(penguin);
		zoo.storeAnimal(elephant);
		zoo.storeAnimal(lion);
		zoo.storeAnimal(tiger);
		
	}
}
