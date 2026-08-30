class Solution {
    public int countSpecialIntegers(int[] nums) {
        Set<Integer> found=new HashSet<>();
        Set<Integer> ns=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        if(i==0||nums[i]!=nums[i-1]){
            if(found.contains(nums[i])){
                ns.add(nums[i]);
            }
            else {
                found.add(nums[i]);
            }
        }
      } 
        return found.size()-ns.size();
    }
}
