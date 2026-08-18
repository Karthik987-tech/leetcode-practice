class Solution {
    public int largestInteger(int[] nums, int k) {
        int h=k;
        int j=0;
        int arr[]=new int[51];
        while(h<=nums.length){
            boolean [] bl=new boolean[51];
            for(int i=j;i<h;i++){
                if(!bl[nums[i]])
                arr[nums[i]]++;
                bl[nums[i]]=true;
            }
            h++;
            j++;
        }
        int max=-1;
        for(int i=0;i<arr.length;i++){
          if(arr[i]==1) {
            max=Math.max(max,i);
          }
        }
        return max;
    }
}
