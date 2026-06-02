class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;
        int f1,f2;
      for(int i=0;i<landDuration.length;i++){
        for(int j=0;j<waterDuration.length;j++){
         f1=Math.max(landStartTime[i]+landDuration[i],waterStartTime[j])+waterDuration[j];
         f2=Math.max(waterStartTime[j]+waterDuration[j],landStartTime[i])+landDuration[i];
         min=Math.min(min,Math.min(f1,f2));
        }
      } 
      return min; 
    }
}
