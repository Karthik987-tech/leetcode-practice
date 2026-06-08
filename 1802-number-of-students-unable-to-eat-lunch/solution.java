class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        for(int e:students){
            q.offer(e);
        }
        int i=0;
        int cnt=0;
        while(!q.isEmpty()){
            if(q.peek()==sandwiches[i]){
                q.poll();
                i++;
                cnt=0;
            }
            else{
                q.offer(q.poll());
                cnt++;
            }
            if(cnt==q.size()) break;
        }
        return sandwiches.length-i;
    }
}
