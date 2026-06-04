class Solution {
    public int totalWaviness(int num1, int num2) {
        int cnt=0;
        while(num1<=num2){
      String s1=Integer.toString(num1);
      for(int i=1;i<s1.length()-1;i++){
         if(s1.charAt(i)>s1.charAt(i-1)&&s1.charAt(i)>s1.charAt(i+1)||s1.charAt(i)<s1.charAt(i-1)&&s1.charAt(i)<s1.charAt(i+1)) cnt++;
      } 
      num1++;
        }
      return cnt;
    }
}
