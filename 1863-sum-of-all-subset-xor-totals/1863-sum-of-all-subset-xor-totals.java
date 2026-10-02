class Solution {
    public int subsetXORSum(int[] nums) {
        int x = 0;
        for (int num : nums) {
            x |= num;
        }
        return x * (1 << (nums.length - 1));
    }
}