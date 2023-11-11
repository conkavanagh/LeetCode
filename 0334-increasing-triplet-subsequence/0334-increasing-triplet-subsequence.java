class Solution {
    public boolean increasingTriplet(int[] nums) {
        int iLowest = 2^31-1; int jLowest=2^31-1;
        for(int i = 0; i<nums.length-2; i++){
            if(nums[i]<iLowest){
                iLowest = nums[i];
                for(int j=i+1; j<nums.length-1;j++){
                    if(nums[i]<nums[j] && nums[j]<jLowest){
                        jLowest = nums[j];
                        for(int k=j+1;k<nums.length;k++){
                            if(nums[j] < nums[k]){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}