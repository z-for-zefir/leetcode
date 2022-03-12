package arrays.height_checker;

/* A school is trying to take an annual photo of all the students.
 * The students are asked to stand in a single file line in non-decreasing order by height.
 * Let this ordering be represented by the integer array expected
 * where expected[i] is the expected height of the ith student in line.
 *
 * You are given an integer array heights representing the current order
 * that the students are standing in.
 * Each heights[i] is the height of the ith student in line (0-indexed).
 *
 * Return the number of indices where heights[i] != expected[i].
 *
 * Example 1:
 *
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 * Explanation:
 * heights:  [1,1,4,2,1,3]
 * expected: [1,1,1,2,3,4]
 * Indices 2, 4, and 5 do not match.
 *
 * Example 2:
 *
 * Input: heights = [5,1,2,3,4]
 * Output: 5
 * Explanation:
 * heights:  [5,1,2,3,4]
 * expected: [1,2,3,4,5]
 * All indices do not match.
 *
 * Example 3:
 *
 * Input: heights = [1,2,3,4,5]
 * Output: 0
 * Explanation:
 * heights:  [1,2,3,4,5]
 * expected: [1,2,3,4,5]
 * All indices match.
 *
 *
 * Constraints:
 *
 * 1 <= heights.length <= 100
 * 1 <= heights[i] <= 100
 * */

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] heights = new int[]{1, 1, 4, 2, 1, 3};

        int k = heightChecker(heights);

        System.out.println(k);
    }

    private static int heightChecker(int[] heights) {
        int indices = 0;

        for (int i = 0; i < heights.length; i++) {
            int minIndex = findMinNonNegativeIndex(heights);
            int curr = heights[minIndex];
            heights[minIndex] = -heights[minIndex];
            if (Math.abs(heights[i]) != curr)
                indices++;
        }

        return indices;
    }

    private static int findMinNonNegativeIndex(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0 && arr[j] < min) {
                minIndex = j;
                min = arr[j];
            }
        }
        return minIndex;
    }

    @SuppressWarnings("ManualArrayCopy")
    private static int heightChecker_head_on_solution(int[] heights) {
        int indices = 0;
        int[] expectedHeights = new int[heights.length];

        for (int i = 0; i < heights.length; i++)
            expectedHeights[i] = heights[i];

        for (int i = 0; i < heights.length; i++) {
            for (int j = 1; j < heights.length; j++) {
                if (heights[j] < heights[j - 1]) {
                    swap(heights, j, j - 1);
                }
            }
        }

        for (int i = 0; i < heights.length; i++)
            if (heights[i] != expectedHeights[i])
                indices++;

        return indices;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int t = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = t;
    }
}
