class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int currentMax = 0;
        int lo = 0; int hi = nums.length-1;
        while(lo<hi)
        {
            if(nums[lo]+nums[hi] >currentMax) currentMax = nums[lo]+nums[hi];
            lo++; hi--;
        }
        return currentMax;
    }
}