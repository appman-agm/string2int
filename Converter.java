import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {

    private String input;

    public Converter(String input) {
        this.input = input;
    }

    public int getResult() {
        List<String> targets = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<String> inputList = Arrays.asList(input.split(""));
        List<Integer> inputNumber = inputList.stream().filter(it -> targets.contains(it)).map(this::getNumber).collect(Collectors.toList());
        Collections.reverse(inputNumber);
        int index = 0;
        int result = 0;
        for(int element : inputNumber) {
            int pow = (int) Math.pow(10, index);
            int acc = 0;
            if (element == 0 && pow == 0){
                acc = 0; // here is when last position is 0
            } else if (element == 0 && pow != 0) {
                acc = 0; // if accumulate is 0 then skip it
            }
            else {
                acc = element * (pow == 0 ? 1 : pow ); // normal case
            }
            result = result + acc;
            index++;
        }
        return result;
    }

    private int getNumber(String character) {
        // Because of I cant casting or parsing variable type
        // So, i convert character to integer with this.
        if (character.equals("0")) {
            return 0;
        } else if (character.equals("1")) {
            return 1;
        } else if (character.equals("2")) {
            return 2;
        } else if (character.equals("3")) {
            return 3;
        } else if (character.equals("4")) {
            return 4;
        } else if (character.equals("5")) {
            return 5;
        } else if (character.equals("6")) {
            return 6;
        } else if (character.equals("7")) {
            return 7;
        } else if (character.equals("8")) {
            return 8;
        } else if (character.equals("9")) {
            return 9;
        } else {
            return 0; // error case throw exception
        }
    }
}
