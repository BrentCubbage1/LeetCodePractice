package Questions.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        int half = nums.length / 2;


        Map<Integer, Integer> theMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (theMap.containsKey(nums[i])){
                theMap.put(nums[i], theMap.get(nums[i]) + 1);
            } else {
                theMap.put(nums[i], 1);
            }

            if (theMap.get(nums[i]) > half){
                return nums[i];
            }

        }
        return -1;
    }
}
