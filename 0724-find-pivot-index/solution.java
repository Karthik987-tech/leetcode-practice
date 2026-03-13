class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
       for(int j=0;j<nums.length;j++){
sum+=nums[j];
       }
        int sumleft=0;
       for(int i=0;i<nums.length;i++){
        if(sumleft==sum-sumleft-nums[i]) return i;
        else{
        sumleft+=nums[i];
        }
       }
       return -1;
    }
}
