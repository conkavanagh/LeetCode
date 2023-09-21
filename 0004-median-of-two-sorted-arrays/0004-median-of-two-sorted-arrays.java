class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length+nums2.length; int n = nums1.length; 
        double median; int medianIndex = total/2;
        int[] nums = new int[total];
        for(int i = 0; i<n; i++){
            nums[i] = nums1[i];
        }
        for(int i = 0; i<nums2.length; i++){
            nums[n+i] = nums2[i];
        }
        Arrays.sort(nums);

        if(total%2 ==0){ //even
            return (double)(nums[medianIndex]+nums[medianIndex-1])/2;
        }
        return (double) nums[medianIndex];
    }
}