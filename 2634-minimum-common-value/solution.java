class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
    HashSet<Integer> set=new HashSet<>();
    for(int each:nums1){
        set.add(each);
    }
       for(int each:nums2){
        if(set.contains(each)) return each;;
    }
    return -1;
    }
}
