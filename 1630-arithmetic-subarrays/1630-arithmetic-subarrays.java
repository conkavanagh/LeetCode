class Solution {
    private boolean isArithmetic(int[] nums)
    {
        Arrays.sort(nums);
        int diff = nums[1] - nums[0];
        for(int i = 2; i< nums.length; i++)
        {
            if(nums[i] - nums[i-1] != diff)
            {
                return false;
            }
        }
        return true;
    } 

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) 
    {
        List<Boolean> res = new ArrayList();
        for(int i = 0; i<l.length; i++)
        {
            int[] temp = new int[r[i]-l[i]+1];
            for(int j = 0; j<temp.length; j++)
            {
                temp[j] = nums[l[i]+j];
            }
            res.add(isArithmetic(temp));
        }
        return res;
    }
}