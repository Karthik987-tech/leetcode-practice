class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> sta=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] arr=new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
                while(!sta.isEmpty()&&nums2[i]>sta.peek()){ 
                    map.put(sta.peek(),nums2[i]);
                    sta.pop();
                }
                sta.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])) arr[i]=map.get(nums1[i]);
            else arr[i]=-1;
        }
        
    return arr;
}
}
