class Solution {
    HashSet<Integer> hs=new HashSet<>();
    public boolean che(int n){
         if(hs.contains(n)) return false;
        else hs.add(n);
        int sum=0;
        while(n>0){
            sum+=(n%10)*(n%10);
            n=n/10;
        }
       
        if(sum==1) return true;
        return che(sum);
    }
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
      
       return che(n);
    }
}
