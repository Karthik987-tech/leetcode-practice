class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int cnt=0,start=0;
        for(int i=0;i<nums.length;i++){
                hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
             
             while(hs.get(nums[i])>k){
                hs.put(nums[start],hs.get(nums[start])-1);
                start++;
             }
             cnt=Math.max(cnt,i-start+1);
        }
        return cnt;
    }
}
