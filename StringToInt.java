public class StringToInt{

     public static void main(String []args){
        String str ="a5b7c3";
        String numberOnly = str.replaceAll("[^0-9]", "");
       
        
        Integer result = Integer.valueOf(numberOnly);
        System.out.println("numberOnly : " + numberOnly);
     }
}