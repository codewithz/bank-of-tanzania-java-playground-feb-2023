package tz.go.bot.collection;

import java.util.*;

public class ListDemo {
	
	public static void main(String[] args) {
		
		List<String> namesList=new ArrayList<String>();
		//<Type> which will be stored in List 
//		List<String>
//		List<Integer>
//		List<Square>
		
		//Adding value to a list 
		
		namesList.add("Tom");
		namesList.add("Mike");
		namesList.add("Alex");
		namesList.add("John");
		
		System.out.println(namesList);
		System.out.println(namesList.size());
		
		List<Integer> numbersList=new ArrayList<>();
		
		numbersList.add(10);
		numbersList.add(100);
		numbersList.add(1000);
		numbersList.add(10000);
		numbersList.add(100000);
//		numbersList.add("Zartab");
		
		System.out.println(numbersList);
		
		//Iterate through the data 
		System.out.println("--------- Iterating Through Collection----------");
		
		for(String name:namesList) {
			System.out.println(name);
			System.out.println(name.toUpperCase());
		}
		
		
		System.out.println("-------- Iterate using Iterator ----------");
		
		Iterator<String> iterator=namesList.iterator();
		
		while(iterator.hasNext()) {
			String name=iterator.next();
			System.out.println(name);
		}
		
		//List of Objects 
		System.out.println("-------- List Of Objects ----------");
		List<Circle> circles=new ArrayList<>();
		
		Circle c1=new Circle(24);
		Circle c2=new Circle(25);
		Circle c3=new Circle(26);
		
		circles.add(c1);
		circles.add(c2);
		circles.add(c3);
		
		for(Circle c:circles) {
			System.out.println(c);
		}
		
		
		
	}

}
