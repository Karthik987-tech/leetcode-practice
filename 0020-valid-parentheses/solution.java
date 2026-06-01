class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta=new Stack<>();
        char [] a=s.toCharArray();
        if((a.length%2)!=0) return false;
         for(int i=0;i<a.length;i++){
            if(a[i]=='('||a[i]=='{'||a[i]=='[')
            {
            sta.push(a[i]);
            }
            else {
            if(sta.isEmpty()) return false;
            
            char top=sta.peek();
            if(a[i]==')'&&top=='(') sta.pop();
           else if(a[i]==']'&&top=='[') sta.pop();
           else if(a[i]=='}'&&top=='{') sta.pop();
           else return false;
         }
         
    }
    return sta.isEmpty();
}
}
