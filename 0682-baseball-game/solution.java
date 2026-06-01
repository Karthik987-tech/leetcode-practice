class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int top1=st.peek();
                st.pop();
                int top2=st.peek();
                st.pop();
                st.push(top2);
                st.push(top1);
                st.push(top1+top2);
                sum+=top1+top2;
            }
            else if(operations[i].equals("D")){
               int top1=st.peek();
               
               st.push(2*top1);
               sum+=2*top1;
            }
            else if(operations[i].equals("C")){
                sum-=st.peek();
               st.pop();
            }
            else{
int a=Integer.parseInt(operations[i]);
             st.push(a);
             sum+=a;
            }
        }
        return sum;
    }
}
