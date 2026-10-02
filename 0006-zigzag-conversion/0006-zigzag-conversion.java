class Solution {
    public String convert(String s, int numRows) {
       if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int CR = 0;
        boolean GD = true;

        for (char c : s.toCharArray()) {
            rows[CR].append(c);
            if (CR == 0) {
                GD = true;
            } else if (CR == numRows - 1) {
                GD = false;
            }
            if (GD) {
                CR++;
            } else {
                CR--;
            }
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
}