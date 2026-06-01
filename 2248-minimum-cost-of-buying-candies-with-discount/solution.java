class Solution {
    public int minimumCost(int[] cost) {
        int sum=0;
        int cnt=0;
        if(cost.length==1) return cost[0];
        if(cost.length==2) return cost[0]+cost[1];
        Arrays.sort(cost);
       for(int i=cost.length-1;i>=0;i--){
          cnt++;
          if(cnt==3){ 
            cnt=0;
          }
          else{
            sum+=cost[i];
          }
       } 
       return sum;
    }
}
