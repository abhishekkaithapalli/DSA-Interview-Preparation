package twopointers;

public class ValidPalindrome {
    public boolean isPallindrome(String str) {  // O(n) Time , O(1)Space
        if (str == null)
            return false;
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            while (right > left && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (right > left && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(str.charAt(left)) !=
                    Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();
        System.out.println(solution.isPallindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(solution.isPallindrome("race a car")); // false
        System.out.println(solution.isPallindrome(" ")); // true
    }
}