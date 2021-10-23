package servcie;

public class String2Int {

	public static void main(String[] args) {
		char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		String input = "a5b9m27c0๑";
		
		String numberic = findNumbericInString(input, number);
		
		System.out.println(input);
		System.out.println(numberic);

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
	
}
