package slidingwindow;

public class LongestRepetingCharacterReplacement {
    public int characterReplacement(String word, int k) {  // Time: O(n), Space: O(1)
        int[] freq = new int[26];                          // Assumes uppercase A-Z only.
        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        for (int right = 0; right < word.length(); right++) {
            freq[word.charAt(right) - 'A']++;
            maxFrequency = Math.max(maxFrequency, freq[word.charAt(right) - 'A']);

            // chars to replace = window length - most frequent char; must be <= k
            while ((right - left + 1) - maxFrequency > k) {
                freq[word.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main (String[] args){
        var solution = new LongestRepetingCharacterReplacement();
        System.out.println(solution.characterReplacement("XYYX", 2));    // 4
        System.out.println(solution.characterReplacement("AAABABB", 1)); // 5
        System.out.println(solution.characterReplacement("ABAB", 0));    // 1
        System.out.println(solution.characterReplacement("AAAA", 2));    // 4
        System.out.println(solution.characterReplacement("A", 0));       // 1
    }
}
