package smallest_differenct;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgramTest {

    @Test
    void name() {
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};

        // -1 ; 26 = 27
        // 5 ; 134 = 129
        // 10 ; 135 = 129

        int[] expected = {28, 26};

        int[] output = Program.smallestDifference(arrayOne, arrayTwo);
        assertTrue(Arrays.equals(expected, output));
    }
}