class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int cnt=0;
       String [] arr=text.split(" ");
       char [] arr1=brokenLetters.toCharArray();
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr1.length;j++){
            if(arr[i].contains(String.valueOf(arr1[j]))){
                cnt++;
                break;
            }
        }
       } 
      int z= arr.length-cnt;
       return z;
    }
}
