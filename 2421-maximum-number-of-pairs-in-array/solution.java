class Solution {
    public int[] numberOfPairs(int[] nums) {
        int cnt=0;
        int[] arr=new int[2];
        if(nums.length==1){
            arr[0]=cnt;
            arr[1]=1;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                cnt++;
                i++;
            }
            arr[0]=cnt;
            arr[1]=nums.length-(cnt*2);
        }
        return arr;
    }
}
