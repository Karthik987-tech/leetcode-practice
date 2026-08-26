class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int l=0;
        int one=0;
        int min=Integer.MAX_VALUE;
        String ans="";
        for(int r=0;r<n;r++){
            if(s.charAt(r)=='1'){
                one++;
            }
            if(one==k){
                while(l<=r&&s.charAt(l)=='0'){
                    l++;
                }
                int len=r-l+1;
                String c=s.substring(l,r+1);
                if(len<min||(len==min&&c.compareTo(ans)<0)){
                    min=len;
                    ans=c;
                }
                one--;
                l++;
            }
        }
        return ans;
    }
}
