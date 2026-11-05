package arrays.hashing;

import java.util.*;

public class TopKFrequentElements {       // Time Complexity o(n) , Space complexity o(n)
    public int[] topKFrequent(int[] nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer>[] numarr =new List[nums.length+1];
        for(var a:nums)
            map.put(a,map.getOrDefault(a,0)+1);
        for(var s: map.keySet()){
           int frequency = map.get(s);
           if(numarr[frequency]==null) {
               numarr[frequency] = new ArrayList<>();
           }
           numarr[frequency].add(s);
        }
        int[] result =new int[k];
        int count =0;
        for(int i=numarr.length-1;i>0&& count <k; i--){
            if(numarr[i]!=null) {
                for (int value : numarr[i]) {
                    result[count++] = value;
                }
            }
        }
        return result;
    }
}
