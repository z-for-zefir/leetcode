package arrays.in_place_operations.move_zeros;

/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 *
 * Constraints:
 *
 * 1 <= nums.length <= 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 * */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int[] nums = new int[]{0, 1, 0, 3, 12};
        int[] expectedNums = new int[]{1, 3, 12, 0, 0};*/

        int[] nums = new int[] {1, 2, 3};
        int[] expectedNums = new int[] {1, 2, 3};

        moveZeros(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(expectedNums));



    }

    private static void moveZeros(int[] nums) {
        int writePtr = 0;
        int readPtr = 0;
        for (; readPtr < nums.length; readPtr++) {
            if (nums[readPtr] != 0) {
                int t = nums[readPtr];
                nums[readPtr] = 0;
                nums[writePtr++] = t;
            }
        }
    }
}
