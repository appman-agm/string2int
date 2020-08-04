public class Main {

    public static void main(String[] args) {
        if (args.length == 1 && args[0] != null) {
            String input = args[0];
            Converter convert = new Converter(input);
            int result = convert.getResult();
            System.out.println(result);
        } else {
            System.out.println("Need at least 1 argument.");
        }
    }
}