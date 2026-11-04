package arrays.hashing;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupanagram(String[] array) { //Time complexity o(n*k), Space complexity o(n*k)
        Map<String, List<String>> maplist = new HashMap<>();
        for (var s : array) {
            var frequency = new Str_Frequency();
            String res_Freq = frequency.freq(s);
            maplist.putIfAbsent(res_Freq, new ArrayList<>());
            maplist.get(res_Freq).add(s);
        }
        return new ArrayList<>(maplist.values());
    }
    public class Str_Frequency { // Helper Class
        public String freq(String str){
            int[] arr=new int[26];
            for(int i=0;i<str.length();i++){
                int index = str.charAt(i)-'a';
                arr[index]+=1;
            }
            StringBuilder SB = new StringBuilder();
            char z='a';
            String result=" ";
            for (int j=0;j< arr.length;j++){
                SB.append(arr[j]);
                SB.append(z);
                z++;
            }
            return SB.toString();
        }
    }
}
