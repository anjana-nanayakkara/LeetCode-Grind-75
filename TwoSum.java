import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){

//        bruteforce solution

//        for(int i=0; i<nums.length; i++){
//            for (int j=i+1; j<nums.length; j++){
//                int complement = target - nums[i];
//
//                if (nums[j] == complement){
//                    return  new int[] {i,j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("no match found");


//        hashmap solution
        Map<Integer, Integer> num_map = new HashMap<>();
        for(int i = 0; i< nums.length;i++){
            int complement = target - nums[i];
            if (num_map.containsKey(complement)){
                return new int[] {num_map.get(complement),i};

            }
            num_map.put(nums[i],i);
        }

        throw new IllegalArgumentException("no match found");
    }
}
