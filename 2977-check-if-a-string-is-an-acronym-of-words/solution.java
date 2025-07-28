class Solution {
    public boolean isAcronym(List<String> words, String s) {
      if(words.size()!=s.length()){
        return false;
      }  
      int i=0;
      for(String st : words){
        if(st.charAt(0)!=s.charAt(i)){
            return false;
        }
        i++;
      }
      return true;
    }
}
