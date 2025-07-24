class Solution {
    public boolean isBalanced(String num) {
        int odd=0;
        int even=0;
        for(int i=0;i<num.length();i++){
         odd=odd+(num.charAt(i)-48);
         i=i+1;
        }
        for(int i=1;i<num.length();i++){
         even=even+(num.charAt(i)-48);
         i=i+1;
        }
        return even==odd;
    }
}
