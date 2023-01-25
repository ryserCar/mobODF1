package longestSubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++){
                if (isLongestSubStringWithoutRepeatingCharacter(s, i, j)) {
                     result = Math.max(result, j-i+1);
                }
            }


        }

        return 0;
    }

    private boolean isLongestSubStringWithoutRepeatingCharacter(String str, int start, int end){
        Set<Character> mySet = new HashSet<>();
        for (int k = start; k <= end; k++){
            Character c = str.charAt(k);
            if (mySet.contains(c)) {
                return false;
            }
            mySet.add(c);
        }
        return true;


        // char a = characters[i];
        //abcabcbb  abcabcde  anviaj
        // if charSet.get(character) ;
        // if not presented we add to charSet and increase count
        // if presented we clean charSet, set result equals to count if count > result. result = 3 if counter > result.
        //return false;
    }
}
