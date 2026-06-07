class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int cnt=0;
        for(int i=0;i<tickets.length;i++){
    if(i <= k)
    cnt += Math.min(tickets[i], tickets[k]);
     else
    cnt += Math.min(tickets[i], tickets[k] - 1);
        }
    return cnt;
    }
}
