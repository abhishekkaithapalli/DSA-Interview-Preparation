package arrays.hashing;

public class ValidAnagram {
    public static boolean anagram(String s, String t) { // Time complexity o(n) , Space comlexity o(1)
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        if(s.length()!=t.length())
            return false;
        for (int i =0;i<s.length();i++){
            var index1 = s.charAt(i)-'a';
            arr1[index1]+=1;
        }
        for(int j=0;j<t.length();j++){
            var index2 = t.charAt(j)-'a';
            arr2[index2]+=1;
        }
        for(int k=0;k<arr1.length;k++){
            if(arr1[k]!=arr2[k])
                return false;
        }
        return true;
    }
}
