class Solution {
    public int countPrefixes(String[] words, String s) {
        int cnt = 0;
        for (String letters: words) {
            if (s.startsWith(letters)) { 
                cnt++;
            }
        }
        return cnt;
    }
}

