class Solution {
    public int[] closestPrimes(int left, int right) {
       boolean [] arr=new boolean[right+1];
       Arrays.fill(arr,true);
       arr[0]=false;
       arr[1]=false;
        for(int i=2;i*i<=right;i++){
          if(arr[i]){
            for(int j=i*i;j<=right;j+=i){
                arr[j]=false;
            }
          }  
        } 
        int num1=-1;
        int num2=-1;
        int prev=-1;
        int mindiff=Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            if(arr[i]){
             if(prev!=-1){
               int diff=i-prev;
               if(diff<mindiff){
                mindiff=diff;
               num1=prev;
               num2=i;
               }
             }
             prev=i;
            }
        }
        return new int[]{num1,num2};
    }
}