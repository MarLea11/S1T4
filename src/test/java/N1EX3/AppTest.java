package N1EX3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private App app;

    @Test
    void ShouldThrowArrayIndexOutOfBondsException() {

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> App.runProgram());

    }

}