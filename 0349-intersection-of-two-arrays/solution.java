class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
          HashSet<Integer> set = new HashSet<>();
          HashSet<Integer> finalres = new HashSet<>();

        for (int n : nums1) {
            set.add(n);
        }

        for (int n : nums2) {
            if (set.contains(n)) {
               finalres.add(n);
            }
        }
        int [] arr=new int[finalres.size()];
        int i=0;
        for(int e:finalres){
            arr[i++]=e;
        }
        return arr;
    }
}
