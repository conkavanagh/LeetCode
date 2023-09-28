class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] sortedArray = new int[n];
        int index = 0;
        for(int i=0; i<n;i++)
        {
            if(nums[i]%2 == 0)
            {
                sortedArray[index] = nums[i];
                index++;
            }
        }
        for(int i=0; i<n;i++)
        {
            if(nums[i]%2 != 0)
            {
                sortedArray[index] = nums[i];
                index++;
            }
        }
        return sortedArray;
        
    }
}