package tz.go.bot.collection;
import java.util.*;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer,String> hashMap=new HashMap<>();
		hashMap.put(101,"Tom");
		hashMap.put(102,"Alex");
		hashMap.put(103,"Mike");
		hashMap.put(104,"John");
		hashMap.put(105,"Elizabeth");
		hashMap.put(103,"Penny");
		
		System.out.println(hashMap);
		
		Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
		linkedHashMap.put(101,"Tom");
		linkedHashMap.put(102,"Alex");
		linkedHashMap.put(104,"John");
		linkedHashMap.put(103,"Mike");
		linkedHashMap.put(105,"Elizabeth");
		linkedHashMap.put(103,"Penny");
		
		System.out.println(linkedHashMap);
		
		Map<Integer,String> treeMap=new TreeMap<>();
		treeMap.put(101,"Tom");
		treeMap.put(102,"Alex");
		treeMap.put(104,"John");
		treeMap.put(103,"Mike");
		treeMap.put(105,"Elizabeth");
		treeMap.put(103,"Penny");
		
		System.out.println(treeMap);
		
	}

}
