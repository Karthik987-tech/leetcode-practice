class Solution {
    public boolean checkString(String s) {
     char [] a=s.toCharArray();
     for(int i=0;i<a.length-1;i++){
        if(a[i]>a[i+1]){
            return false;
        }
     }
     return true;   
    }
}
