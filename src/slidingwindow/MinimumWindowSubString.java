package slidingwindow;

public class MinimumWindowSubString {
    public String minimumWindowSubString(String s, String t) {  // O(128*n) Time , O(1) Space
        if (s == null || t == null || s.length() < t.length())
            return "";

        int[] windowFreq = new int[128];
        int[] targetFreq = new int[128];
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;
        for (char letter : t.toCharArray())
            targetFreq[letter]++;

        for (int right = 0; right < s.length(); right++) {
            windowFreq[s.charAt(right)]++;
            while (contains(windowFreq, targetFreq)) {
                int currLength = right - left + 1;
                if (currLength < minLength) {
                    minLength = currLength;
                    minStart = left;
                }
                windowFreq[s.charAt(left)]--;
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }

    private boolean contains(int[] window, int[] target) {
        for (int i = 0; i < window.length; i++) {
            if (target[i] > window[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        var result = new MinimumWindowSubString();
        var solution = result.minimumWindowSubString("OUZODYXAZV","XYZ");
        var solution1 = result.minimumWindowSubString("x","XYZ");
        System.out.println(solution);
        System.out.println(solution1);

    }
}
