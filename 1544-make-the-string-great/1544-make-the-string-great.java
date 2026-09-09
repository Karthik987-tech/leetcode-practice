class Solution {
    public String makeGood(String s) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        String s1="";
           for(int i=0;i<s.length();i++){
        if(st1.isEmpty()) st1.push(s.charAt(i));
        else if(st1.peek()==(s.charAt(i)-32)||st1.peek()-32==s.charAt(i)) st1.pop();
        else st1.push(s.charAt(i));
      } 
      while(!st1.isEmpty()){
        st2.push(st1.pop());
      } 
      while(!st2.isEmpty()){
        s1+=st2.pop();
      }
      return s1;
    }
}