package tz.go.bot.collection;

import java.util.*;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<String> hSet=new HashSet<>();
		hSet.add("G");
		hSet.add("E");
		hSet.add("O");
		hSet.add("R");
		hSet.add("G");
		hSet.add("E");
		
		System.out.println("HashSet --> "+hSet);
		
		Set<String> lhSet=new LinkedHashSet<>();
		lhSet.add("G");
		lhSet.add("E");
		lhSet.add("O");
		lhSet.add("R");
		lhSet.add("G");
		lhSet.add("E");
		
		System.out.println("LinkedHashSet --> "+lhSet);
		
		Set<String> tSet=new TreeSet<>();
		tSet.add("G");
		tSet.add("E");
		tSet.add("O");
		tSet.add("R");
		tSet.add("G");
		tSet.add("E");
		
		System.out.println("TreeSet --> "+tSet);
		
	}

}
