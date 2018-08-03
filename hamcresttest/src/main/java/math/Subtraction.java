package math;

public class Subtraction {
	public static int subTwoNumbers(int num1, int num2) {
		return num1 - num2 ;
	}
	
	public static int subThreeNumbers(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
	
	public static int subFromHundred(int... num) {
		int result = 100;
		for(int i = 0 ; i < num.length ; i++)
			result = result - num[i]; 
		return result;
	}
}
