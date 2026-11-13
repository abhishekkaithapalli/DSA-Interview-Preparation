package twopointers;

public class ValidPalindrom {
    public boolean palidromCheck(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<=right){
           while (right>left && !Character.isLetterOrDigit(str.charAt(left))){
               left++;
            }
           while (right>left && !Character.isLetterOrDigit(str.charAt(right))){
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
}
