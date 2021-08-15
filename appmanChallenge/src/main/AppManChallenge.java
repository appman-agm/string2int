package main;

public class AppManChallenge {

	public static void main(String[] args) {
		String text = "a5b7c3";
		AppManChallenge.stringToInt(text);
		System.out.println(AppManChallenge.stringToInt(text));
	}
	
	public static int stringToInt(String s) {
		s = AppManChallenge.removeAlphabet(s);
		int num = 0;
		int length = s.length();
		
		for (int i = 1; i <= length; i++) {
			// Ascii of character at index i-1 minus with Ascii of '0' will get digit between 0-9
			num += (s.charAt(i-1) - '0') * Math.pow(10, length-i);
		}
		return num;
	}
	
	public static String removeAlphabet(String s) {
		StringBuilder sb = new StringBuilder();
		s = s.replace(" ", "").replaceAll("[-+*/]", "");
		
		for (int i = 0; i < s.length(); i++) {
			if(!Character.isAlphabetic(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

}
