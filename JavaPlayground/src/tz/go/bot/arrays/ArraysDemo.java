package tz.go.bot.arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
//		Declare
		int[] iArray;
//		Construct
		iArray=new int[6];
//		Initialize
		iArray[1]=5;
		iArray[4]=4;
		iArray[5]=9;
		
//		Iterate
		int len=iArray.length;
		
		for(int index=0;index<len;index++) {
			System.out.println(iArray[index]);
		}
		
	}

}
