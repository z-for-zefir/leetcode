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

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        List<Integer> answer = Arrays.asList(5, 6);

        List<Integer> calculated = findDisappearedNumbers(nums);

        System.out.println(answer + " = answer");
        System.out.println(calculated + " = calculated");
    }
    
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0)
                i++;
            else {
                if (nums[nums[i] - 1] == nums[i]) {
                    if (nums[i] - 1 != i)
                        nums[i] = 0;
                    else
                        i++;
                } else {
                    int temp = nums[i];
                    nums[i] = nums[nums[i] - 1];
                    nums[temp - 1] = temp;

                }
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                result.add(i + 1);
        }
        return result;
    }
}
