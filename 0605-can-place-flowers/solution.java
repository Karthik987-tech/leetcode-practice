class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt=0;
        int n1=flowerbed.length;
        if(n1==1 &&flowerbed[0]==0) return cnt+1>=n;
       for(int i=0;i<n1;i++){
        if(i!=0&&i!=n1-1&&flowerbed[i-1]==0&&flowerbed[i+1]==0&&flowerbed[i]==0) {
            flowerbed[i]=1;
            cnt++;
            i++;
            
        }
        else if((i==0&&flowerbed[0]==0&&flowerbed[1]==0)||(i==n1-1&&flowerbed[n1-1]==0&&flowerbed[n1-2]==0)) {
        flowerbed[i]=1;
        cnt++;
        }
       } 
       return cnt>=n;
    }
}
