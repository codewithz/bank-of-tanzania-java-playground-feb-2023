package tz.go.bot.reflection;

import java.util.ArrayList;

public class Min {

	@SuppressWarnings("unchecked")
	static void wordsList() {
		ArrayList wordList=new ArrayList<>();
		//Type Safety
		
		//Cause an unchecked warning
		wordList.add("Test");
		
		System.out.println("Word List -->"+wordList);
	}
	public static void main(String[] args) {
		wordsList();
	}
}
