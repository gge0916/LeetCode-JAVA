import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/description/
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

public class TwoSum_001 {
    /**
     * Using a haspmap to store (number, index) pair.
     * time complexity: O(n)
     * space complexity: O(n)
     * @param nums input array
     * @param target target sum
     * @return indices
     */
    public int[] twoSum_1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
