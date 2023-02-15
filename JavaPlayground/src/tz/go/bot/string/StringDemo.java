package tz.go.bot.string;

public class StringDemo {

	public static void main(String[] args) {
		
		String s="Bank of ";
		System.out.println(s);
		
		System.out.println("---------- concat ------------");
		
		String s1="Tanzania";
		String s2=s.concat(s1);
		System.out.println(s2);
		
		String s3=s+s1;
		System.out.println(s3);
		
		System.out.println("----- Length-----------");
		
		int l1=s.length();
		System.out.println("Length of "+s+" is "+l1);
		int l2=s2.length();
		System.out.println("Length of "+s2+" is "+l2);
		
		System.out.println("----------- Equality ------------");
		
		String x1="BANK OF TANZANIA";
		String x2="bank of tanzania";
		
		System.out.println(x1.equals(x2)); //checks for exact match incl cases
		System.out.println(x1.equalsIgnoreCase(x2)); // check for exact match excl cases
		
		
		System.out.println("----------- Trims and Empty Checks------");
		
		String s4="   Bank of Tanzania   ";
		System.out.println(s4);
		int l4=s4.length();
		System.out.println("Length before trim is "+l4);
		String s5=s4.trim();
		System.out.println(s5);
		int l5=s5.length();
		System.out.println("Length after trim is "+l5);
		
		String s6="";
		
		System.out.println("Empty Check for s6:"+s6.isEmpty());
		System.out.println("Empty Check for s5:"+s5.isEmpty());
		
		
		System.out.println("--------- Index and Char At---------");
		
		String s7="Standard";
		System.out.println(s7);
		
		char c=s7.charAt(2);
		System.out.println("Character at index 2 is "+c);
		
		int i1=s7.indexOf("d");
		System.out.println(i1);
		
		int i2=s7.indexOf("d",i1+1);
		System.out.println("Index of second d is:"+i2);
		
		System.out.println("-------- Upper and Lower Case---");
		
		System.out.println("x1:"+x1);
		x1=x1.toLowerCase();
		System.out.println("x1:"+x1);
		
		System.out.println("x2:"+x2);
		x2=x2.toUpperCase();
		System.out.println("x2:"+x2);
		
		System.out.println("------------ Replace and Split Operations ----");
		
		String s8="Jxvx";
		String s9=s8.replaceAll("x", "a");
		System.out.println(s8+"----"+s9);
		
		String data="1,Tom,IT,Dev,3500000";
		String[] dataArray=data.split(",");
		System.out.println(data);
		
		for(String d:dataArray) {
			System.out.println(d);
		}
		
		System.out.println("------------ Substring --------------------");
		
		String s10="Hamburger";
		System.out.println(s10);
		
		String s11=s10.substring(3);
		System.out.println(s11);
		
		String s12=s10.substring(4, 8);
		System.out.println(s12);
		
		
		System.out.println("-------- StringBuffer -----------------");
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		sb.append(s1);
		System.out.println(sb);
		
		//How to convert StringBuffer back to String 
		String s13=sb.toString();
		System.out.println(s13);
		
		String x="Something";
		//With String 
		
		int len=x.length();
		String reversedString="";
		for(int index=len-1;index>=0;index--) {
			reversedString=reversedString+x.charAt(index);
		}
		System.out.println(x+"----"+reversedString);
		
		//String Buffer 
		
		StringBuffer sb1=new StringBuffer(x);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		
	}
	
}
