package math;

public class Addition {

	public static int addTwoNumbers(int num1, int num2) {
		return num1 + num2 ;
	}
	
	public static int addThreeNumbers(int num1, int num2, int num3) {
		return num1 + num2 + num2;
	}
	
	public static int addNumbers(int... num) {
		int result = 0;
		for(int i = 0 ; i < num.length ; i++)
			result = result + num[i]; 
		return result;
	}
	
}
