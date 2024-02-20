package N1EX3;

import java.util.ArrayList;

public class App {

    protected App (){}

    public static void runProgram() {
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();

        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);
        listNumbers.add(5);

        System.out.println(listNumbers.get(6));

    }



}
