class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int cnt=0;
      for(int i=0;i<gain.length;i++){
        sum+=gain[i];
cnt=Math.max(cnt,sum);
      }  
      return cnt;
    }
}
