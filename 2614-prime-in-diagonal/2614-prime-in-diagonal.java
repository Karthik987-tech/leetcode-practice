class Solution {
    public int diagonalPrime(int[][] nums) {
             int n = nums.length;
        int maxPrime = 0;

        for (int i = 0; i < n; i++) {
            int a = nums[i][i];

            if (isPrime(a)) {
                maxPrime = Math.max(maxPrime, a);
            }
            int b = nums[i][n - i - 1];

            if (isPrime(b)) {
                maxPrime = Math.max(maxPrime, b);
            }
        }
        return maxPrime;
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