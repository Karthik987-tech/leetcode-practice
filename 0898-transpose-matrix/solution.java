class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] mat=new int[matrix[0].length][matrix.length];
        for(int i=0;i<=matrix[0].length - 1;i++){
            for(int j=0;j<=matrix.length - 1;j++){
                mat[i][j]=matrix[j][i];
            }
        }
        return mat;
    }
}
