class Solution {
    public int trailingZeroes(int n) {
        int rcnt = 0;
         while(n != 0){
            n = n / 5;
            rcnt += n;
         }
         return rcnt;
    }
}