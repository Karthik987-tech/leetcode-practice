class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int k=n;
      while(n>0){
        int lastdig=n%10;
        sum+=lastdig;
        mul*=lastdig;
        n=n/10;
      }  
      if(k%(sum+mul)==0) return true;
      else return false;
    }
}
