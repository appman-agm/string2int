import java.util.Scanner;

public class String2IntTest {
	public static void main(String[] args){
		//Input Here
		System.out.println("Enter your input:");
		String input = new Scanner(System.in).nextLine();
		System.out.print(testString2Int(input));
	}
	public static int testString2Int(String input){
		int result = 0;
		double unit = 0.1;
		for(int i= input.length()-1;i>=0;i--){
			char c = input.charAt(i);
			int check = c-48;
			if(check >= 0 && check <= 9){
				unit = unit*10;
				result += check*unit;
			}
		}
		return result;
	}
}

