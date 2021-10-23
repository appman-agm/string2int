package servcie;

public class String2Int {

	public static void main(String[] args) {
		char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		String input = "jh2kf44w34";
	
		String numberic = findNumbericInString(input, number);
		myStringToInteger(numberic);

	}
	
	public static String findNumbericInString(String str, char[] number) {
		if (str == null || str.isEmpty()) {
			System.out.println("Input Type String is Null");
			return "";
		} else {
			String numberic = "";
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < number.length; j++) {
					if (number[j] == str.charAt(i)) {
						numberic +=  str.charAt(i);
					}
				}
			}
			System.out.println("Input Type String : " + str);
			return numberic;
		}

		
	}
	
	public static void myStringToInteger(String str) {
		if (str != null && !str.isEmpty()) {
			int answer = 0;
			for (int i = 0; i < str.length(); i++) {
				answer = (answer*10) + (str.charAt(i) - '0');
			}
			System.out.println("Result Type Int : " + answer);
		}
	}
	
}
