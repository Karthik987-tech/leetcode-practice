class Solution {
    public int minElement(int[] nums) {
        int [] sum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
               int n=nums[i]%10;
                sum[i]+=n;
                nums[i]=nums[i]/10;
            }
        }
        Arrays.sort(sum);
        return sum[0];
        }
    }
