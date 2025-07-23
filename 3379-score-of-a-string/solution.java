class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n-1;i++){
            int a=((s.charAt(i))-(s.charAt(i+1)));
           if(a>0) sum=sum+a;
           else if(a<0) sum =sum-a;
        }
        return sum;
    }
}
