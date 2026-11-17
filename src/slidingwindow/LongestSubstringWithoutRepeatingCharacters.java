package slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String word) {  // O(n) Time , O(n) Space
        if (word == null || word.isEmpty())
            return 0;
        int left = 0;
        int max_length = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < word.length(); right++) {
            while (set.contains(word.charAt(right))) {
                set.remove(word.charAt(left));
                left++;
            }
            set.add(word.charAt(right));
            max_length = Math.max(max_length, right - left + 1);
        }
        return max_length;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        System.out.println("Test 1 (abcabcbb): " + solution.lengthOfLongestSubstring("abcabcbb")); // Expected: 3
        System.out.println("Test 2 (bbbbb): " + solution.lengthOfLongestSubstring("bbbbb"));       // Expected: 1
        System.out.println("Test 3 (pwwkew): " + solution.lengthOfLongestSubstring("pwwkew"));     // Expected: 3
        System.out.println("Test 4 (empty): " + solution.lengthOfLongestSubstring(""));            // Expected: 0
        System.out.println("Test 5 (null): " + solution.lengthOfLongestSubstring(null));           // Expected: 0
    }
}
