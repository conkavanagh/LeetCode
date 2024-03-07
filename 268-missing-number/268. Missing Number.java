class Solution {
    public int missingNumber(int[] nums) {
        // Sort then return when nums[n] != n
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != i) return i;
        }
        // If none are not equal then we're missing the next number on
        return nums.length;
    }
}