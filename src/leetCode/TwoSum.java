package leetCode;

import java.util.HashMap;
import java.util.Map;

// #01
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int x = target - nums[i];

            if(hash.containsKey(x)){
                int[] ind = new int[2];
                ind[0] = i;
                ind[1] = hash.get(x);
                return ind;
            }

            hash.put(nums[i], i);
        }

        return new int[0];
    }
}
