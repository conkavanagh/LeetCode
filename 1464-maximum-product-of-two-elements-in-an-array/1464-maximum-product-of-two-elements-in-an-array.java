class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length<2) return 0;
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}