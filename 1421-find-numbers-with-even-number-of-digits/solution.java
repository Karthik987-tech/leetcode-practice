class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int p=0;
        for(int i=0;i<n;i++){
            int[] cnt=new int[n];
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                cnt[i]++;
            }
            if(cnt[i]%2==0) p++; 
        }
        System.out.println(p);
        return p;
    }
}
