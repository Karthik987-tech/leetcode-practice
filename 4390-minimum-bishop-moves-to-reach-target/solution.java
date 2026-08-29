class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int cnt=-1;
        if(source[0]%2==0&&source[1]%2==0||source[0]%2!=0&&source[1]%2!=0){
            if(target[0]%2==0&&target[1]%2==0||target[0]%2!=0&&target[1]%2!=0){
                if(source[0]+source[1]==target[0]+target[1]||source[0]-source[1]==target[0]-target[1]) cnt=1;
                else cnt=2; 
            }
        }
        else if(source[0]%2==0&&source[1]%2!=0||source[0]%2!=0&&source[1]%2==0){
            if(target[0]%2==0&&target[1]%2!=0||target[0]%2!=0&&target[1]%2==0){
                 if((source[0]+source[1])==(target[0]+target[1])||(source[0]-source[1])==(target[0]-target[1])) cnt=1;
                else cnt=2; 
            }
        }
        return cnt;
    }
}
