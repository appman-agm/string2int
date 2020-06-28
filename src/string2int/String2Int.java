package string2int;


public class String2Int {

	public static void main(String[] args) {
		int result = filterIntfromString("...abc12d34");
		System.out.println(result);
	}
	
	
	public static int filterIntfromString (String word) {
		if (word == null || word == "") 
			return 0;
		
		word = word.replaceAll("\\D+","");
		return convertStringToInt(word);
	}
	
	public static int convertStringToInt (String word) {
		 int answer = 0, factor = 1;
		    for (int i = word.length()-1; i >= 0; i--) {
		        answer += (word.charAt(i) - '0') * factor;
		        factor *= 10;
		    }
		    return answer;
	}
}
