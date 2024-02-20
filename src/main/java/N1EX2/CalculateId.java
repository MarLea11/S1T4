package N1EX2;

import java.util.ArrayList;

public class CalculateId {

    protected CalculateId(){}

    public static void runProgram() {

        System.out.println(calculateIdLetterBasedOnNumber(6));

    }

    public static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static char calculateIdLetterBasedOnNumber(int number) {

        if (number < 1 || number > 26) {
            throw new IllegalArgumentException("The number must be between 1 and 26.");
        }
        return LETTERS.charAt(number - 1);
    }

}