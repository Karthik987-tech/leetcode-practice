class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String addstring="";
        String addstring2="";
        for(String k:word1){
            addstring+=k;
        }
        for(String b:word2){
            addstring2+=b;
        }
        return addstring.equals(addstring2);
    }
}
