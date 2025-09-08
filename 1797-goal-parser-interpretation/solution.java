class Solution {
    public String interpret(String command) {
String s=command.replace("(al)","al");
String s1=s.replace("()","o");
return s1;
    }
}
