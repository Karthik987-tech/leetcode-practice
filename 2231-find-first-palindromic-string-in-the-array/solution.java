class Solution {
    public String firstPalindrome(String[] words) {
        for (String each : words) {
            if (isPalindrome(each)) {
                return each;
            }
        }
        return ""; 
    }

    public boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

