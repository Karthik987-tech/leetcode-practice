class Solution {
    public int primePalindrome(int n) {
         if (n <= 11) {
            int[] small = {2, 3, 5, 7, 11};
            for (int x : small) {
                if (x >= n) {
                    return x;
                }
            }
        }
        for (int i = 1; i <= 100000; i++) {
           String s = String.valueOf(i);
            String palindrome =
                s + new StringBuilder(s.substring(0, s.length() - 1))
                    .reverse()
                    .toString();

            int num = Integer.parseInt(palindrome);

            if (num >= n && isPrime(num)) {
                return num;
            }
        }
        return -1;
    }
    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}