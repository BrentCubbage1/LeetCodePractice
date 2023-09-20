package Questions.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> theMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int targetGoal = target - nums[i];

            if (theMap.containsKey(targetGoal)) {
                return new int[]{i, theMap.get(targetGoal)};
            } else {
                theMap.put(nums[i], i);
            }
        }
        return null;


    }
}