class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int cnt=0,cnt1=0;
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0) cnt++;
            else cnt1++;
        }
        if(cnt1==0||cnt==0) return true;
        return true;
    }
}