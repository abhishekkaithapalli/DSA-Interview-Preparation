package arrays.hashing;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {
    public boolean count_Duplicates(int[] nums){ //Time Complexity o(n) , space complexity o(n)
        Set<Integer> set = new HashSet<>();
        for (int i=0;i< nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
