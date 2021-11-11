class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = 0;
        for (int num: nums) {
            sum += num;
            minSum = Math.min(sum, minSum);
        }
        return 1 - minSum;
    }
}
