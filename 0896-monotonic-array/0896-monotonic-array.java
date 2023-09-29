class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        boolean monotonicA = true;
        int i = 1;
        while (monotonicA && i<n) //Monotone increasing
        {
            if(nums[i-1] > nums[i])
            {
                monotonicA = false;
            }
            i++;
        }
        if(monotonicA)
        {
            return true;
        }
        for(int j = 1; j<n;j++)//Monotone decreasing
        {
            if(nums[j-1]<nums[j])
            {
                return false;
            }
        }
        return true;
        
    }
}