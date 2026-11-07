package arrays.hashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums){    // Time complexity o(n) , Space complexity o(n)
        HashSet<Integer> set = new HashSet<>();
        int count =0;
        int max_count =0;
        for (int a: nums)
            set.add(a);
        for(var d : set){
            if(!set.contains(d-1)){
                int current = d;
                count++;
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                max_count=Math.max(count,max_count);
                count=0;
            }
        }
        return max_count;
    }
}
