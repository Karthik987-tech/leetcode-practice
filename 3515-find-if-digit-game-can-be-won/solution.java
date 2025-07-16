class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int alice=0;
        int bob=0;
        for(int i=0;i<n;i++){
           if(nums[i]>=1&&nums[i]<=9){
            alice=alice+nums[i];
           }
           else if(nums[i]>9&&nums[i]<100){
            bob=bob+nums[i];
           }
        }
        if(bob==alice) return false;
        else return true;
    }
}
