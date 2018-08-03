package string;

public class StringOperations {
	public static String addTwoStrings(String num1, String num2) {
		return num1 + num2 ;
	}
	
	public static String addThreeStrings(String num1, String num2, String num3) {
		return num1 + num2 + num2;
	}
	
	public static String addStrings(String... num) {
		String result = "";
		for(int i = 0 ; i < num.length ; i++)
			result = result + num[i]; 
		return result;
	}
}
