package twopointers;

import java.util.Arrays;

public class TwoIntegerSumII {
    public int[] twoSum(int[] nums , int target){ // Time complexity o(n) , Space complexity o(1)
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
    public static void main(String[] args) {
        TwoIntegerSumII solver = new TwoIntegerSumII();

        // Test Case 1: Standard positive numbers (Expected:)
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Test 1 Result: " + Arrays.toString(solver.twoSum(numbers1, target1)));

        // Test Case 2: Non-adjacent elements (Expected:)
        int[] numbers2 = {2, 3, 4};
        int target2 = 6;
        System.out.println("Test 2 Result: " + Arrays.toString(solver.twoSum(numbers2, target2)));

        // Test Case 3: Negative numbers (Expected:)
        int[] numbers3 = {-1, 0};
        int target3 = -1;
        System.out.println("Test 3 Result: " + Arrays.toString(solver.twoSum(numbers3, target3)));

        // Test Case 4: Duplicate values (Expected:)
        int[] numbers4 = {1, 3, 3, 5};
        int target4 = 6;
        System.out.println("Test 4 Result: " + Arrays.toString(solver.twoSum(numbers4, target4)));
    }
}
