class Solution {
    public int differenceOfSum(int[] nums) {
     int elementSum=0;
     int digitSum=0;
    for(int each:nums){
        elementSum+=each;
        if(each<10){
            digitSum+=each;
        }
        else{
            while(each>0){
                digitSum+=each%10;
                each=each/10;
            }
        }
    }  
    int n=Math.abs(elementSum-digitSum);
    return n; 
    }
}
