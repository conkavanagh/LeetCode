/*
class Solution {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i< nums.length; i++)
        {
            for (int j = 0; j< nums.length; j++)
            {
                if(nums[i] == nums[j] && i != j)
                {
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
*/
class Solution {
    public int findDuplicate(int[] nums) {
       Arrays.sort(nums);
       for(int i=1; i<nums.length; i++)
       {
           if(nums[i]==nums[i-1])
           {
               return nums[i];
           }
       }
       return 0;
    }
}