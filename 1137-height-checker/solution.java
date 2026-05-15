class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int height []=new int[heights.length];
        for(int k=0;k<heights.length;k++){
            height[k]=heights[k];
        }
        int temp;
      for(int i=0;i<heights.length;i++){
        for(int j=0;j<heights.length-1;j++){
            if(heights[j]>heights[j+1]){
temp=heights[j];
heights[j]=heights[j+1];
heights[j+1]=temp;
            }
        }
      }  
          for(int k=0;k<heights.length;k++){
            if(height[k]!=heights[k]) c++;
        }
        return c;
    }
}
