import java.util.Scanner;
import java.lang.Math; 
public class TestString2Int {

	public static void main(String[] args) {
		boolean bool = true;
		while(bool) {
			Scanner sc = new Scanner(System.in);  
	        System.out.print("Enter Text Or Enter \"ex\" To Exit : ");
	        String str = sc.nextLine();
	        char[] number = new char[str.length()];
        	if(str.equals("ex")) {
        		bool = false;
			}else {
				int j = 0; int summary = 0; int run = 0;
				for(int i = 0; i < str.length(); i++){
    	            char ch = str.charAt(i);
    	            if(ch > 47 && ch < 58){
    	            	number[j] = ch;
    	            	j++;
    	            }
    	        }
				for(int i = j-1; i >= 0; i--){
					if(number[run]>0) {
						int mat = (int)Math.pow(10,i);
						summary += (number[run]-48)*mat;
						run++;
					}
    	        }
				System.out.println(summary);
			}
		}
	}
}
