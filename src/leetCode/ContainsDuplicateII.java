package leetCode;

import java.util.HashMap;
import java.util.Map;

// #219
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                int x = i - hash.get(nums[i]);
                if(x <= k){
                    return true;
                }
            }
            hash.put(nums[i], i);
        }

        return false;
    }
}
