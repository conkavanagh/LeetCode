class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i = 0; i<k; i++)
        {
            sum += nums[i];
        } 
        double average = sum/k;
    	double maxAverage = average;

        for(int i = k; i<nums.length; i++)
        {
            sum = sum + nums[i] - nums[i-k];
            average = sum/k;
            maxAverage = Math.max(average, maxAverage);
        }
        return maxAverage;
    }
}