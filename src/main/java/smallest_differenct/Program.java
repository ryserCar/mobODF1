package smallest_differenct;

import java.util.Arrays;

public class Program {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int [] result = new int[2];
        int minimum_diff = Math.abs(arrayOne[0] - arrayTwo[0]);
        int minimum_diff_value_arrayOne = arrayOne[0];
        int minimum_diff_value_arrayTwo = arrayTwo[0];
        Arrays.sort(arrayTwo);
        for (int i = 0;i<arrayOne.length; i++) {
            for (int j = 0;j<arrayTwo.length;j++){
                int temp = Math.abs(arrayOne[i] - arrayTwo[j]);
                if (temp < minimum_diff) {

                }
            }

        }

        return null;
    }
}
