class Solution {
    public int minBitFlips(int start, int goal) {
        int k=start^goal;
        int cnt=0;
        while(k>0){
            cnt += k& 1;
            k = k >> 1;
        }
        return cnt;
    }
}