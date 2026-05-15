class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp;
        for(int i=1;i<nums.length;i++){
            int k=i;
            int j=i-1;
            if(nums[i]%2==0){
           while(j>=0){
            temp=nums[j];
            nums[j]=nums[k];
            nums[k]=temp;
            j--;
            k--;
           }
            }
        }
        return nums;
    }
}
