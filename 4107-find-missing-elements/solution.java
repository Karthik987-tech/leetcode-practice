class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ls=new ArrayList<>();
      Arrays.sort(nums);
      int i=0;
     while(i<nums.length-1){
        if(nums[i]+1!=nums[i+1]){
            ls.add(nums[i]+1);
            nums[i]++;
        }
        else i++;
     }
return ls;
    }
}
