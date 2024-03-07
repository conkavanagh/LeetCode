class Solution {
    public int missingNumber(int[] nums) {
        // Expected total of n+1 minus the total of nums
        int n = nums.length;
        int expectedTotal = n*(n+1)/2;
        int runningTotal = 0;
        for(int i : nums) runningTotal +=i;

        return expectedTotal - runningTotal;
    }
}