class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        for(int k:nums){
            if(min>=k) min=k;
            if(max<=k) max=k;
            }
            for(int k:nums){
            if(k!=min&&k!=max){
                return k;
            }
            }
        return -1;
    }
    }
