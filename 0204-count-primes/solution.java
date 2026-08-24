class Solution {
    public int countPrimes(int n) {
        int k=0;
        if(n<=2) return 0;
        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;arr[1]=false;
        for(int i=2;i*i<n;i++){
            if(arr[i]){
               for(int j=i*i;j<n;j=j+i){
                arr[j]=false;
               }
            }
        }
        for(int i=2;i<n;i++){
            if(arr[i]) k++;
        }
        return k;
    }
}
