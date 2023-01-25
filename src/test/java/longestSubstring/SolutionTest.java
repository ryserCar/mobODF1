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

    @Test
    void shouldReturnOne() {
        String s = "bbbbb";
        int expected = 1;
        assertEquals(expected, underTest.lengthOfLongestSubstring(s));
    }

    @Test
    void shouldReturnThree2() {
        String s = "pwwkew";
        int expected = 3;
        assertEquals(expected, underTest.lengthOfLongestSubstring(s));
    }

    @Test
    void shouldReturnFive() {
        String s = "anviaj";
        int expected = 5;
        assertEquals(expected, underTest.lengthOfLongestSubstring(s));
    }

}