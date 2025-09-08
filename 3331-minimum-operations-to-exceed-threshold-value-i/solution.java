class Solution {
    public int minOperations(int[] nums, int k) {
        int cnt=0;
    for(int each:nums){
        if(each<k){
            cnt++;
        }
    }   
    return cnt; 
    }
}
