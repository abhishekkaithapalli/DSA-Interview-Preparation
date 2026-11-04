import arrays.hashing.TopKFrequentElements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]nums ={7,7};
        var val = new TopKFrequentElements();
       var result=  val.topKFrequent(nums,1);
        System.out.println(Arrays.toString(result));
    }
}