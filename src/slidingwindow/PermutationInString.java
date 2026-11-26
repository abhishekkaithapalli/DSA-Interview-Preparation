package slidingwindow;

import java.util.Arrays;

public class PermutationInString {
    public boolean permutationInString(String s1, String s2) {  //O(26*n)Time ,O(1) space
        if (s1.length() > s2.length())                          // Ignore constant so O(n)Time
            return false;
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(count1, count2)) {
            return true;
        }
        for (int right = s1.length(); right < s2.length(); right++) {
            count2[s2.charAt(right) - 'a']++;
            count2[s2.charAt(right - s1.length()) - 'a']--;

            if (Arrays.equals(count1, count2))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        var solution = new PermutationInString();
        System.out.println(solution.permutationInString("abc", "ab"));       // false (s1 longer than s2)
        System.out.println(solution.permutationInString("abc", "abc"));      // true (same length, exact match)
        System.out.println(solution.permutationInString("aab", "ab"));       // false (s1 longer than s2)
        System.out.println(solution.permutationInString("aab", "baaxx"));    // true (permutation at the start)
        System.out.println(solution.permutationInString("abc", "xxxxabc"));  // true (permutation at the end)
    }
}
