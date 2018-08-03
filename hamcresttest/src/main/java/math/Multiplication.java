package math;

public class Multiplication {
	public static int multiplyTwoNumbers(int num1, int num2) {
		return num1 * num2 ;
	}
	
	public static int multiplyThreeNumbers(int num1, int num2, int num3) {
		return num1 * num2 * num2;
	}
	
	public static int multiplyNumbers(int... num) {
		int result = 1;
		for(int i = 0 ; i < num.length ; i++)
			result = result * num[i]; 
		return result;
	}
}
