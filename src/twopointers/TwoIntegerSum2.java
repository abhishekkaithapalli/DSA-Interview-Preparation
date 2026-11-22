package twopointers;

public class TwoIntegerSum2 {
    public int[] two_Integer_Sum(int[] nums , int target){ // Time complexity o(n) , Space complexity o(1)
        int left = 0;
        int right = nums.length-1;
        int count=0;
        int[] result = new int[2];
        int sum;
        while(right > left){
            sum=nums[left]+nums[right];
            if(sum>target){
                right--;
            }
           else if(sum<target){
                left++;
            }
            else{
                result[count++]=left+1;
                result[count++]=right+1;
                break;
            }
        }
        return result;
    }
}
