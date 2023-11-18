class Solution {
    public int pivotIndex(int[] nums) {
        int currentPivot = 0;
        int total = 0;
        for(int i = 0; i<nums.length; i++)
        {
            total +=nums[i];
        }
        int leftTotal = 0; int rightTotal = total-nums[0];
        if(rightTotal == 0) return 0;
        for(int i = 1; i<nums.length; i++)
        {
            leftTotal +=nums[i-1];
            rightTotal = rightTotal - nums[i];
            if(leftTotal==rightTotal) return i;
        }
        return -1;
    }
}