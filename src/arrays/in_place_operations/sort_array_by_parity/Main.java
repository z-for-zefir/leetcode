package arrays.in_place_operations.sort_array_by_parity;

/*
* Given an integer array nums,
* move all the even integers at the beginning of the array followed by all the odd integers.
*
* Return ANY array that satisfies this condition.
*
* Example 1:
*
* Input: nums = [3,1,2,4]
* Output: [2,4,3,1]
* Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
* Example 2:
*
* Input: nums = [0]
* Output: [0]
*
*
* Constraints:
*
* 1 <= nums.length <= 5000
* 0 <= nums[i] <= 5000
* */

import java.util.Arrays;

public class Main {
    // четные в начале, нечетные в конце
    public static void main(String[] args) {
        /*int[] nums = new int[]{0, 1, 0, 3, 12};
        int[] expectedNums = new int[]{0, 0, 12, 1, 3};*/

        int[] nums = new int[] {1, 2, 3};
        int[] expectedNums = new int[] {2, 1, 3};

        int[] result = sortArrayByParity(nums);

        System.out.println("Order doesn't matter:");
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(expectedNums));

    }

    public static int[] sortArrayByParity(int[] nums) {
        return nums;
    }
}
