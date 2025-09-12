class Solution {
    public void moveZeroes(int[] nums) {
        int cnt=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0) cnt++;
        }
        while(cnt-- >0){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
        }
        System.out.println(Arrays.toString(nums));
    }
}
