class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] arr=new int[arr1.length];
        int index=0;
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int each:arr1){
            if(map.containsKey(each)){
                map.put(each,map.get(each)+1);
            }
            else{
                map.put(each,1);
            }
        }
        for(int each2:arr2){
            while(map.containsKey(each2)&&map.get(each2)>0){
arr[index++]=each2;
map.put(each2,map.get(each2)-1);
            }
        }
        for(int each3:arr1){
            while(map.containsKey(each3)&&map.get(each3)>0){
                al.add(each3);
                map.put(each3,map.get(each3)-1);
            }
        }
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            arr[index++]=al.get(i);
        }
        return arr;
    }
}
