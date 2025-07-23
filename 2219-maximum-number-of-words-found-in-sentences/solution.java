class Solution {
    public int mostWordsFound(String[] sentences) {
        int cnt[]=new int[sentences.length];
     for(int i=0;i<sentences.length;i++){
        for(int j=0;j<sentences[i].length();j++){
            if(sentences[i].charAt(j)==32) cnt[i]++;
        }
     }
     int max=cnt[0];
     for(int i=0;i<sentences.length;i++){
        if(max<=cnt[i]) max=cnt[i];
     }
     return max+1;
    }
}
