class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       ArrayList<Integer> arr=new ArrayList<>();
       int t=0;
       int b=matrix.length-1;
       int l=0;
       int r=matrix[0].length-1;
       while(t<=b&&l<=r){
        for(int j=l;j<=r;j++){
            arr.add(matrix[t][j]);
       }
       t++;
       for(int i=t;i<=b;i++){
        arr.add(matrix[i][r]);
       }
       r--;
       if(t<=b){
         for(int j=r;j>=l;j--){
            arr.add(matrix[b][j]);
         }
       b--;
       }
       if(l<=r){
          for(int i=b;i>=t;i--){
            arr.add(matrix[i][l]);
          }
          l++;
       }
    }
    return arr;
    }
}
 
