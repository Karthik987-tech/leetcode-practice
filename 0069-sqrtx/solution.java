class Solution {
    public int mySqrt(int x) {
       if(x<2) return x;
       int lef=1;
       int rig=x/2;
       int sr=1;
       while(lef<=rig){
         int mid=lef+(rig-lef)/2;
         if(mid<=x/mid){
            sr=mid;
            lef=mid+1;
         }
         else{
            rig=mid-1;
         }
       }
       return sr;
    }
}
