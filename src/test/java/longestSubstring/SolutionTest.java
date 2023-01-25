package longestSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution underTest = new Solution();

    @Test
    void shouldReturnThree() {
        String s = "abcabcbb";
        int expected = 3;
        assertEquals(expected, underTest.lengthOfLongestSubstring(s));
    }

}