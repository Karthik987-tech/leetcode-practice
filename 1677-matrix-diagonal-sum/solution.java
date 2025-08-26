class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int sum1=0;
      for(int i=0;i<mat.length;i++){
        for(int j=i;j<=i;j++){
            sum+=mat[i][i];
        }
      }
      int j=mat.length-1;
      for(int i=0;i<mat.length;i++){
        if(i!=j){
    sum1+=mat[i][j];
        }
        j--;
      } 
    return sum+sum1;
    }
}
