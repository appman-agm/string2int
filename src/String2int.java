import java.util.ArrayList;

public class String2int {
	int result = 0;
	ArrayList<String> output = new ArrayList<String>();
	public int string2int(String input) {
		result = Integer.parseInt(input.replaceAll("[^\\d]", ""));
		 return result;
		}
       
	
}
