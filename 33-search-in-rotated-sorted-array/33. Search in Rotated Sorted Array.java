class Solution {
    public int search(int[] nums, int target) {
        // Binary search
        int hi = nums.length-1;
        int lo = 0;
        while(hi>=lo){
            int mid = (lo+hi)/2;
            if(target == nums[mid]) return mid;
            else if(nums[lo] <= nums[mid]){
                if (nums[lo] <= target && target < nums[mid]) hi = mid - 1;
                else  lo = mid + 1;
            }
            else{
                if (nums[mid] < target && target <= nums[hi]) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        return -1;
    }
}