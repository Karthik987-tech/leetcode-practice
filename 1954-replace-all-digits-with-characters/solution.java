class Solution {
    public String replaceDigits(String s) {
        char [] a=s.toCharArray();
        for(int i=1;i<a.length;i++){
            a[i]=(char)(a[i-1]+(a[i]-48));
            i++;
        }
        String k=new String(a);
        return k;
    }
}
