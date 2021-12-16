package arrays.in_place_operations.replace_with_greatest_on_the_right;
/*
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right,
 * and replace the last element with -1.
 *
 * After doing so, return the array.
 *
 * Example 1:
 *
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 * Explanation:
 * - index 0 --> the greatest element to the right of index 0 is index 1 (18).
 * - index 1 --> the greatest element to the right of index 1 is index 4 (6).
 * - index 2 --> the greatest element to the right of index 2 is index 4 (6).
 * - index 3 --> the greatest element to the right of index 3 is index 4 (6).
 * - index 4 --> the greatest element to the right of index 4 is index 5 (1).
 * - index 5 --> there are no elements to the right of index 5, so we put -1.
 * Example 2:
 *
 * Input: arr = [400]
 * Output: [-1]
 * Explanation: There are no elements to the right of index 0.
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 * */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        //int[] expected = new int[]{18, 6, 6, 6, 1, -1};
        //int[] arr = new int[]{400};
        //int[] expected = new int[]{-1};
        int[] arr = new int[]{1, 2};
        int[] expected = new int[]{2, -1};

        replaceElements(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(expected));

    }

    public static void replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            var k = arr[maxElementIndex(arr, i + 1)];
            arr[i] = arr[maxElementIndex(arr, i + 1)];
        }
        arr[arr.length - 1] = -1;
    }

    private static int maxElementIndex(int[] arr, int startIndex) {
        int maxIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }
}
