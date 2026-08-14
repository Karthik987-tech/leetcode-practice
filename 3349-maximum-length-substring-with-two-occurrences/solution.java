class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0,st=0;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
          
            while(hs.get(s.charAt(i))>2){
                 hs.put(s.charAt(st),hs.get(s.charAt(st))-1);
                 st++;
            }
            max=Math.max(max,i-st+1);
        }  
        return max;
    }
}
