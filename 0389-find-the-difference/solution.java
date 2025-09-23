class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr1=s.toCharArray();
         char[] arr2=t.toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         String s1=new String(arr1);
         String s2=new String(arr2);
         if(s.length()==0) return t.charAt(0);
          for(int i=0;i<s1.length();i++){
             if(s1.charAt(i)!=s2.charAt(i)) return s2.charAt(i);
          }
          return s2.charAt(s2.length()-1);
}
}
