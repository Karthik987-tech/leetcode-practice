class Solution {
    public int missingMultiple(int[] nums, int k) {
        int freq[]=new int[102];
        boolean bl=false;
      for(int i=0;i<nums.length;i++){
        if(nums[i]%k==0){
            int n=nums[i]/k;
           freq[n]++;
        }
      }
      for(int i=1;i<freq.length;i++){
        if(freq[i]==0){
            bl=true;
            return i*k;
        }
        if(bl) break;
      }
      return k;
    }
}
