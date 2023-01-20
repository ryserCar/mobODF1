package addTwoNumbers;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List addTwoNumbers(List list1, List list2) {
        List<Integer> result = new LinkedList<Integer>();

        // 2 4 3
        // 5 6 4
        // 2 + 5 if sum >=10 7
        // 4 + 6 if sum >=10 0 , 1 going to next
        // 3 + 4 + 1(from previous iteration) 8

        for (int i = 0, j = 0; i < list1.size() || j < list2.size(); i++, j++) {
            int sum = (int)list1.get(i) + (int)list2.get(j);


        }
        return null;
    }
}
