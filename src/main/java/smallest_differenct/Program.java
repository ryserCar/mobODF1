package smallest_differenct;

import java.util.Arrays;

public class Program {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

        // {-1, 5, 10, 20, 28, 3};
        // {26, 134, 135, 15, 17};
        int minimum_diff = Math.abs(arrayOne[0] - arrayTwo[0]);
        int minimum_diff_value_arrayOne = arrayOne[0];
        int minimum_diff_value_arrayTwo = arrayTwo[0];
        Arrays.sort(arrayTwo);
        // {15, 17, 26, 134, 135};

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                int temp = Math.abs(arrayOne[i] - arrayTwo[j]);
                if (temp >= minimum_diff) continue;
                System.out.println(i + " : " + j);
                minimum_diff = temp;
                minimum_diff_value_arrayOne = arrayOne[i];
                minimum_diff_value_arrayTwo = arrayTwo[j];
            }
        }
        int[] result = {minimum_diff_value_arrayOne, minimum_diff_value_arrayTwo};
        System.out.println(Arrays.toString(result));
        return result;
    }
}
