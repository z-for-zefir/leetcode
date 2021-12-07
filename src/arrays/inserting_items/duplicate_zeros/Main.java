package arrays.inserting_items.duplicate_zeros;

/*
 * https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
 *
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place and do not return anything.
 *
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 *
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};

        duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));
    }

    @SuppressWarnings("ManualArrayCopy")
    public static void duplicateZeros(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                            arr[j] = arr[j - 1];
                }

                arr[i++] = 0;
            }
        }
    }

}
