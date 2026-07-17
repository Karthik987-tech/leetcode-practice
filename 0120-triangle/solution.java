class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int arr[]=new int[triangle.size()];
        for(int i=0;i<triangle.size();i++){
arr[i]=triangle.get(triangle.size()-1).get(i);
        }
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                arr[j]=triangle.get(i).get(j)+Math.min(arr[j],arr[j+1]);
            }
        }
        return arr[0];
    }
}
