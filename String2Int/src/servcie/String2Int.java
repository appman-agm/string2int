package servcie;

public class String2Int {

	public static void main(String[] args) {
		char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		String input = "jh2kf44w34";
		
		String numberic = findNumbericInString(input, number);
		int result = myStringToInteger(numberic);
		
		System.out.println("Input Type String :" + input);
		System.out.println("Result Type Int : " + result);

	}
	
	public static String findNumbericInString(String str, char[] number) {
		String numberic = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < number.length; j++) {
				if (number[j] == str.charAt(i)) {
					numberic +=  str.charAt(i);
				}
			}
		}
		return numberic;
	}
	
	public static int myStringToInteger(String str) {
	    int answer = 0;
	    for (int i = 0; i < str.length(); i++) {
	    	answer = (answer*10) + (str.charAt(i) - '0');
		}
	    return answer;
	}
	
}
