class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String uniqueBinary = "";
        for(int i = 0; i<nums.length; i++)
        {
            char[] temp = nums[i].toCharArray();
            if(temp[i] == '0') uniqueBinary +=1;
            else uniqueBinary +=0;
        }
        return uniqueBinary;
    }
}