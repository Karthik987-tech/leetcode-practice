class Solution {
    public String makeGood(String s) {
        Stack<Character> st1=new Stack<>();
        String s1="";
           for(int i=s.length()-1;i>=0;i--){
        if(st1.isEmpty()) st1.push(s.charAt(i));
        else if(st1.peek()==(s.charAt(i)-32)||st1.peek()-32==s.charAt(i)) st1.pop();
        else st1.push(s.charAt(i));
      } 
      while(!st1.isEmpty()){
        s1+=st1.pop();
      } 
      return s1;
    }
}