class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOnes = 0;
        int head = 0;
        int zeroCount = 0;
        int tail = 0;
        int length = head-tail;
        while(head<nums.length)
        {
            if(nums[head] ==0) zeroCount++;
            head++;
            if(zeroCount>k)
            {
                if(nums[tail] == 0) 
                {
                    zeroCount--;
                }
                tail++;
            }
        }
        return head-tail;
    }
}