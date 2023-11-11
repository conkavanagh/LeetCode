class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productArray = new int[nums.length];
        int runningProduct = 1;
        for(int i = 0; i<nums.length; i++) // Left Product
        {
            productArray[i] = runningProduct;
            runningProduct *= nums[i];
        }
        runningProduct = 1;
        for(int j = nums.length-1; j>=0; j--) // Right Product
        {
            productArray[j] *= runningProduct;
            runningProduct *= nums[j];
        }
        return productArray;
    }
}