class Solution {
    public String largestGoodInteger(String num) {
        int currentMax = 0;
        char[] nums = num.toCharArray();
        for(int i = 1; i< nums.length-1;i++)
        {
            if(nums[i]==nums[i-1] && nums[i]==nums[i+1]) 
                currentMax = Math.max(nums[i], currentMax);
        }
        if(currentMax ==0) return "";
        String res = Character.toString(currentMax);

        return res+res+res;
    }
}