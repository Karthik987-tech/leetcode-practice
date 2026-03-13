class Solution {
    public boolean isPalindrome(String s) {
        String z = "";
        String k = "";

        for(int i = 0; i < s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));

            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){
                z += c;
            }
        }

        for(int i = z.length() - 1; i >= 0; i--){
            k += z.charAt(i);
        }

        return k.equals(z);
    }
}
