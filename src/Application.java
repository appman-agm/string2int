public class Application {

    public static void main(String[] args) {
        System.out.println("stringToInt \"Hello World\": " + stringToInt("Hello World"));
        System.out.println("stringToInt \"abc573\": " + stringToInt("abc573"));
        System.out.println("stringToInt \"a5b7c3\": " + stringToInt("a5b7c3"));
        System.out.println("stringToInt \"556677\": " + stringToInt("556677"));
        System.out.println("stringToInt \"1234567891\": " + stringToInt("1234567891"));
        System.out.println("stringToInt \"1234.567890\": " + stringToInt("1234.567890"));
        System.out.println("stringToInt \"01234.567890\": " + stringToInt("01234.567890"));
        System.out.println("stringToInt null: " + stringToInt(null));
    }

    public static Integer stringToInt(String str) {
        if (str != null) {
            StringBuilder strInt = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    strInt.append(str.charAt(i));
                }
            }
            if (strInt.toString().length() > 0) {
                return Integer.valueOf(strInt.toString());
            }
        }
        return null;
    }
}
