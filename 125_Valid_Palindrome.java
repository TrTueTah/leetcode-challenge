class Solution {
    // Solution 1: Reverse String
    // public boolean isPalindrome(String s) {
    //     StringBuilder newStr = new StringBuilder();
    //     for(char c : s.toCharArray()) {
    //         if(Character.isLetterOrDigit(c)) {
    //             newStr.append(Character.toLowerCase(c));
    //         }
    //     }
    //     return newStr.toString().equals(newStr.reverse().toString());
    // }

    // Solution 2: Two Pointers
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while(left < right && !alphaNum(s.charAt(left))) {
                left++;
            }
            while(right > left && !alphaNum(s.charAt(right))) {
                right--;
            }
            if(Character.toLowerCase(s.charAt(right)) != Character.toLowerCase(s.charAt(left))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' || 
                c >= 'a' && c <= 'z' || 
                c >= '0' && c <= '9');
    }
}
