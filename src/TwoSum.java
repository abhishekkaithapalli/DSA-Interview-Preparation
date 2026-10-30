import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int []nums = {3,3};
        var result = TwoSum.twoSum(nums,6);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[]nums,int target){
        Map<Integer,Integer> hash = new HashMap<>();
        for (int i=0;i< nums.length;i++){
            int complement = target-nums[i];
            if(hash.containsKey(complement)){
                int [] result = new int[2];
                result[0]=hash.get(complement);
                result[1]=i;
                return result;
            }
            hash.put(nums[i],i );
        }
        return new int[0];
    }

}