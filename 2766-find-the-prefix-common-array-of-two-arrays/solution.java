class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int []arr=new int[51];
        int []arrcon=new int[A.length];
        int common =0;
      for(int i=0;i<A.length;i++){
        arr[A[i]]++;
        if(arr[A[i]]==2) common++;
        arr[B[i]]++;
        if(arr[B[i]]==2) common++;
arrcon[i]=common;
      }
      return arrcon;
        }
    }
