class Solution {
    public String removeDuplicates(String s) {
        char [] a=s.toCharArray();
        StringBuilder ss=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(char x:a){
            if(st.isEmpty()) st.push(x);
            else{
            char z=st.peek();
            if(x==z){
                st.pop();
            }
            else st.push(x);
        }
        }
        for(char x:st){
ss.append(x);
        }
        return ss.toString();
    }
}
