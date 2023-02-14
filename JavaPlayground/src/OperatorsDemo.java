
public class OperatorsDemo {
	
	public static void main(String[] args) {
		
		//Arithmetic Operators 
		
		int i=10;
		int j=20;
		
		int addition=i+j;
		System.out.println(addition);
		
		int subtraction=i-j;
		System.out.println(subtraction);
		
		int multiplication=i*j;
		System.out.println(multiplication);
		
		double division=(double)j/15;
		System.out.println(division);
		
		//Logical Operators 
		
//		club two or more conditions and check for the 
//		if both conditions are true or if one is true
		
//		Bank of Tanzania, gives loan to
//		1. income --> good
//		2. creditScore --> good
		
//		&& -- AND
//		|| -- OR
		
		boolean highIncome=true;
		boolean goodCreditScore=true;
		boolean isStudent=true;
		
		System.out.println("Welcome to Bank of Tanzania Loan Processing System!!");
		
		if(highIncome && goodCreditScore) {
			System.out.println("Loan will be approved");
		}else {
			System.out.println("Loan will not be approved");
			
		}
		
		if(isStudent && (highIncome || goodCreditScore)) {
			System.out.println("Loan can be approved");
		}
		System.out.println("-------------- Task ----------------------");
		
//		Task 
		
		int age=17;
		
		if(age>=18) {
			System.out.println("Eligible Age");
		}else {
			System.out.println("Not Eligible Age");
		}
		
//		Ternary Operator
//		SomeVariable=(condition)?valueIfConditionIsTrue:valueIfConditionIsFalse
		
		String message=(age>=18)?"Eligible":"Not Eligible";
		System.out.println(message);
		
		
		
		
		
	}

}
