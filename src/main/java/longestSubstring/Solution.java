package longestSubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        Set<Character> charSet = new HashSet<Character>();
        char[] characters = s.toCharArray();
        int count = 0;
        for (int i = 0; i < characters.length; i++) {
            char a = characters[i];
            //abcabcbb  abcabcde  anviaj
            // if charSet.get(character) ;
            // if not presented we add to charSet and increase count
            // if presented we clean charSet, set result equals to count if count > result. result = 3 if counter > result.

        }

        return 0;
    }
}
