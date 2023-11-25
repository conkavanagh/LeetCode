class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int prefix = 0;
        int suffix = 0;

        for(int i =1; i<nums.length; i++)
        {
            suffix +=nums[i];
        }
        
        for(int i=0; i< nums.length; i++)
        {
            int left = (nums[i] * i) - prefix;
            int right = suffix - (nums[i] * (n-i-1));
            prefix+=nums[i];
            if(i<nums.length-1)suffix-=nums[i+1];
            else suffix=0;
            res[i] = left+right;
        }
        return res;
    }
}