class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int head = 0; int tail = 0;
        int length = 0; int maxLength = 0;
        while(head < nums.length)
        {
            if(nums[head++] ==0) zeroCount++;
            if(zeroCount>1)
            {
                if(nums[tail++] == 0) zeroCount--;
            }
            length = head - tail - 1;
            maxLength = Math.max(length, maxLength);
        }  
        return maxLength;
    }
}