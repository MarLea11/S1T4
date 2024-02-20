package N1EX2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculateIdTest {

    private CalculateId calculateId;

    @BeforeEach
    void createIdForTests() {
        calculateId = new CalculateId();
    }

    @Test
    void calculateValidValue() {
        assertEquals('A', calculateId.calculateIdLetterBasedOnNumber(1));
        assertEquals('Z', calculateId.calculateIdLetterBasedOnNumber(26));
    }

    @ParameterizedTest(name = "Test with number {0}")
    @ValueSource(ints = {1, 5, 6, 8, 11, 13, 18, 22, 25, 26})
    void calculateLetterBasedOnNumber(int number) {
        assertEquals(calculateId.LETTERS.charAt(number - 1), calculateId.calculateIdLetterBasedOnNumber(number));
    }


    /*
    void shouldThrowTheCorrectLetter(int number) {
        assertEquals('I', number);
        assertEquals('J', number);
        assertEquals('K', number);
        assertEquals('L', number);
    }
     */



}