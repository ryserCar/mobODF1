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
        int s1 = list1.size();
        int s2 = list1.size();
        int size  = s1;
        if (s2>s1) {
            size = s2;
        }
        int carry = 0;
        //for (int i = 0, j = 0; i < list1.size() || j < list2.size(); i++, j++) {
        for (int i = 0; i<size; i++) {
            int tempSum = (int)list1.get(i) + (int)list2.get(i) + carry;
            // tempSum = 16
            int sum = tempSum%10;
            carry = tempSum/10;
            result.add(sum);
            System.out.println("sum and carry: "+sum+" and "+carry);
        }
        return result;
    }
}
