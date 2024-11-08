class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int xorr = nums[0];
        int maxXor = (1<<maximumBit)-1;
        int n = nums.length;

        for(int i=1; i<n; i++) xorr ^= nums[i];

        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = xorr ^ maxXor;
            xorr ^= nums[n-1-i];
        }
        return ans;
    }
}