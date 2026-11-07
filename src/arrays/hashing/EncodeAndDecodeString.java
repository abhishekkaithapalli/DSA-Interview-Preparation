package arrays.hashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {
    public String encodeString(List<String> list) { // Time Complexity O(n) ,Space complexity O(n)
        StringBuilder builder = new StringBuilder();
        for (var a : list) {
            builder.append(a.length()).append("#").append(a);
        }
        return builder.toString();
    }
    public List<String> decode(String str){
        List<String> result = new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int j=i+1;
            while (j<str.length()){
                if(str.charAt(j)!='#')
                    j++;
                else {
                    int length = Integer.parseInt(str.substring(i, j));
                    i = j + 1;
                    String temp = str.substring(i,i+length);
                    result.add(temp);
                    i+=length;
                    j=i;
                    break;
                }
            }
        }
        return result;
    }
}
