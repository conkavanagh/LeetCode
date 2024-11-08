class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int xorr = nums[0];
        int maxXor = (1<<maximumBit)-1;

        for(int i=1; i<nums.length; i++) xorr ^= nums[i];

        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = xorr ^ maxXor;
            xorr ^= nums[nums.length-1-i];
        }
        return ans;
    }
}