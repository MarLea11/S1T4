package N1EX1;

import java.util.ArrayList;
import java.util.List;

public class MonthList {

    protected MonthList(){}

    public static void runProgram() {

        System.out.println(createOrderedMonthList());

    }

    public static ArrayList<String> createOrderedMonthList() {
        ArrayList<String> listMonthsOrdered = new ArrayList<String>();

        listMonthsOrdered.add("January");
        listMonthsOrdered.add("February");
        listMonthsOrdered.add("March");
        listMonthsOrdered.add("April");
        listMonthsOrdered.add("June");
        listMonthsOrdered.add("July");
        listMonthsOrdered.add("August");
        listMonthsOrdered.add("September");
        listMonthsOrdered.add("October");
        listMonthsOrdered.add("November");
        listMonthsOrdered.add("December");

        return listMonthsOrdered;
    }

}
