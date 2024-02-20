package N1EX1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MonthListTest {

    private MonthList monthList;
    private ArrayList<String> listMonthsOrdered;


    // BETTER METHOD USING JUNIT ANNOTATIONS (@BeforeEach to initialize the list)
    @BeforeEach
    void createMonthListForTests() {
        monthList = new MonthList();
        listMonthsOrdered = monthList.createOrderedMonthList();
    }

    @Test
    void monthListShouldContainsTwelvePositions() {
        assertEquals(12, listMonthsOrdered.size());
    }

    @Test
    void monthListShouldNotBeNULL() {
        assertNotNull(listMonthsOrdered);
    }

    @Test
    void monthListPositionEightShouldBeAugust() {
        assertEquals("August", listMonthsOrdered.get(8));
    }
}

    /*
    // METHOD WITH CODE REPETITION
    @Test
    void monthListShouldContainsTwelvePositions() {
       MonthList monthList = new MonthList();
       ArrayList<String> listMonthsOrdered = monthList.createOrderedMonthList();
       assertEquals(12, listMonthsOrdered.size());
    }

    @Test
    void monthListShouldNotBeNull() {
        MonthList monthList = new MonthList();
        ArrayList<String> listMonthsOrdered = monthList.createOrderedMonthList();
        assertNotNull(listMonthsOrdered);
    }

    @Test
    void monthListPositionEightShouldBeAugust() {
        MonthList monthList = new MonthList();
        ArrayList<String> listMonthsOrdered = monthList.createOrderedMonthList();
        assertEquals("August", listMonthsOrdered.get(8));
    }
    */
