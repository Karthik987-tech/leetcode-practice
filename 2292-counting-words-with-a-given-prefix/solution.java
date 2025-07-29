class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt=0;
        for(String k:words){
            if(k.startsWith(pref))cnt++;
        }
        return cnt;
    }
}
