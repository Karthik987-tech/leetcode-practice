class Solution {
    public int earliestTime(int[][] tasks) {
        int [] arr=new int[tasks.length];
        for(int i=0;i<tasks.length;i++){
            for(int j=0;j<tasks[i].length-1;j++){
                arr[i]=tasks[i][j]+tasks[i][j+1];
            }
        }
        Arrays.sort(arr);
        return arr[0];
    }
}
