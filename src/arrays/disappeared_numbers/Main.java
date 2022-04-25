package arrays.disappeared_numbers;

/* Given an array nums of n integers
 * where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 * Example 1:
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 *
 * Example 2:
 * Input: nums = [1,1]
 * Output: [2]
 *
 * Constraints:
 * n == nums.length
 * 1 <= n <= 10^5
 * 1 <= nums[i] <= n
 * Follow up: Could you do it without extra space and in O(n) runtime?
 * You may assume the returned list does not count as extra space.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> answer = Arrays.asList(5, 6);

        List<Integer> calculated = findDisappearedNumbers(nums);
        calculated.sort(Integer::compareTo);

        System.out.println(answer + " = answer");
        System.out.println(calculated + " = calculated");
    }

    @SuppressWarnings("UnnecessaryLocalVariable")
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        return result;
    }
}
