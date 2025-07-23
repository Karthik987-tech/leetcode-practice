class Solution {
    public int reverseDegree(String s) {
        char[] ar=s.toCharArray();
        int sum=0;
        for(int i=1;i<=s.length();i++){
            sum=sum+(123-ar[i-1])*i;
        }
        return sum;
    }
}
