class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
        int freq=nums[i];
        int value=nums[i+1];
        for(int j=0;j<freq;j++){
            arr.add(value);
        }
        }
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}
