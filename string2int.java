import java.util.Scanner;
import java.util.ArrayList;
/**
 * string2int
 */
public class string2int {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '0' && str.charAt(i) < '9') {
                int intCh = str.charAt(i) - '0';
                intArray.add(intCh);
            }
            
        }
        for (Integer integer : intArray) {
            System.out.print(integer);
        }
        
        
    }
    
}