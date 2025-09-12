class Solution {
    public int searchInsert(int[] nums, int target) {
      for(int i=0;i<nums.length;i++){
        if(nums[i]==target) return i;
        else if(nums.length==1) {
            if(target<nums[0]) return 0;
            else return 1;
        }
        else{
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]<target&&nums[j+1]>target) return j+1;
                else if(nums[0]>target) return 0;
            }
        }
      }  
return nums.length;
    }
}
