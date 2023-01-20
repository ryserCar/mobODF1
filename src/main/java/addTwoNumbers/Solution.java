package addTwoNumbers;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List addTwoNumbers(List list1, List list2) {
        List<Integer> result = new LinkedList<>();

        // 2 4 3
        // 5 6 4
        // 2 + 5 if sum >=10 7
        // 4 + 6 if sum >=10 0 , 1 going to next
        // 3 + 4 + 1(from previous iteration) 8
        int s1 = list1.size();
        int s2 = list2.size();
        int size = s1;
        if (s2 > s1) {
            size = s2;
        }
        int carry = 0;

        //for (int i = 0, j = 0; i < list1.size() || j < list2.size(); i++, j++) {
        for (int i = 0; i < size; i++) {
            int i1, i2;
            i1 = getItem(list1, s1, i);
            i2 = getItem(list2, s2, i);

            int tempSum = i1 + i2 + carry;
            // tempSum = 16
            int sum = tempSum % 10;
            carry = tempSum / 10;

            result.add(sum);
            System.out.println("sum and carry: " + sum + " and " + carry);
        }
        if (carry > 0) {
            result.add(carry);
        }
        return result;
    }

    private int getItem(List list1, int s1, int i) {
        int i1;
        if (i >= s1) {
            i1 = 0;
        } else {
            i1 = (int) list1.get(i);
        }
        return i1;
    }
}
