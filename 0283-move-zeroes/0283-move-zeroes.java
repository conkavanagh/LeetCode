class Solution {
    public void moveZeroes(int[] nums) {
        int[] newNums = new int[nums.length];
        int index = 0;
        for(int i:nums)
        {
           if (i!=0)
           {
               newNums[index] = i;
               index++;
           }
        }
        for(int i = index; i<nums.length; i++)
        {
            newNums[i] = 0;
        }
        for(int i = 0; i<nums.length; i++)
        {
            nums[i] = newNums[i];
        }
    }
}