class Solution {
    public int addDigits(int num) {
        if(num<=9) return num;
        int t=sumOf(num);
        return t;
    }
    public int sumOf(int n){
    int sum=0;
    while(n>0){
    sum+=n%10;
    n=n/10;
    }
    if(sum<=9)
    {
         return sum;
    }
    return sumOf(sum);
}
}
