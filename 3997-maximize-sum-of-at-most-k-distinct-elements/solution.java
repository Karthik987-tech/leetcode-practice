class Solution { public int[] maxKDistinct(int[] nums, int k)
                { 
                    int [] arr=new int[k];
                    Arrays.sort(nums);
                    for(int i=0;i<nums.length-1;i++)
                    {
                  if(nums[i]==nums[i+1]) nums[i]=0; 
                    }
                    Arrays.sort(nums);
                    int z=0; 
                    for(int j=nums.length-k;j<nums.length;j++)
                    {
                        arr[z]=nums[j]; z++;
                    }
                    int cnt=0;
                    for(int h=0;h<arr.length;h++){
                        if(arr[h]!=0) cnt++;
                    }
                    int []fiarr=new int[cnt];
                    int o=0; 
                    for(int w=arr.length-1;w>=arr.length-cnt;w--)
                    {
                        fiarr[o]=arr[w]; o++;
                    }
                    return fiarr;
                }
               }
