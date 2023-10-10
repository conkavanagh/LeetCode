class Solution {
    public int[] searchRange(int[] nums, int target) {
        int index = binarySearch(nums,target);
        if (index == -1)
        {
            return new int[] {-1,-1};
        }
        int first = index, last = index, i=index-1, j=index+1;
        if(index == 0)
        {
            first = index;
        }
        else
        {
            while (i>=0 && nums[i] == target)
            {
                first = i;
                i--;
            }
        }
        if(index == nums.length-1)
        {
            last = index;
        }
        else
        {
            while (j<nums.length && nums[j] == target)
            {
                last = j;
                j++;
            }
        }
        return new int[] {first, last};
    }

    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }
        return -1;
    }
}