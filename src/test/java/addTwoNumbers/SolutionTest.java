package addTwoNumbers;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import javax.xml.transform.SourceLocator;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    Solution testClass = new Solution();
    @Test
    public void shouldReturnEightZeroSeven() {
        List list1 = Arrays.asList(2, 4, 3);
        List list2 = Arrays.asList(5, 6, 4);
        assertTrue(testClass.addTwoNumbers(list1,list2);
    }
}