class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> la=new ArrayList<>();
        for(int i=1;i<=n;i++){
       if(i%3==0&&i%5==0) la.add("FizzBuzz");
        else if(i%3==0) la.add("Fizz");
        else if(i%5==0) la.add("Buzz");
        else la.add(Integer.toString(i));
        }
        return la;
    }
}
