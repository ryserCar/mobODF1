package addTwoNumbers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution testClass = new Solution();
    @Test
    public void shouldReturnEightZeroSeven() {
        List list1 = Arrays.asList(2, 4, 3);
        List list2 = Arrays.asList(5, 6, 4);
        List expected = Arrays.asList(7, 0, 8);
        assertEquals(expected, testClass.addTwoNumbers(list1,list2));
    }

    @Test
    public void testTwoArraysOfDifferentSizes() {
        List list1 = Arrays.asList(9, 9, 9, 9, 9, 9, 9);
        List list2 = Arrays.asList(9, 9, 9, 9);
        List expected = Arrays.asList(8, 9, 9, 9, 0, 0, 0, 1);
        assertEquals(expected, testClass.addTwoNumbers(list1,list2));
    }

    @Test
    public void testArraysWithValueZero() {
        List list1 = Arrays.asList(0);
        List list2 = Arrays.asList(0);
        List expected = Arrays.asList(0);
        assertEquals(expected, testClass.addTwoNumbers(list1,list2));
    }
}