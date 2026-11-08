package arrays.hashing;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[]nums){ //Time Complexity O(n) , Space Complexity O(1)
        int[] result = new int[nums.length];
        int prefix =1;
        for(int i=0 ;i< nums.length;i++){
            result[i]=prefix;
            prefix=nums[i]*prefix;
        }
        int postfix =1;
        for(int j= nums.length-1; j>=0 ; j--){
            result[j]*=postfix;
            postfix=nums[j]*postfix;
        }
        return result;
    }
}
