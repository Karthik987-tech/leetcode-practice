class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
       for(int i=0;i<details.length;i++){
        if((((details[i].charAt(11)-48)*10)+(details[i].charAt(12)-48))>60) cnt++;
       } 
       return cnt;
    }
}
