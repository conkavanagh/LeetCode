class Solution {
    public int findSpecialInteger(int[] arr) {
        int target = arr.length/4;
        int count = 1;
        if(arr.length == 1) return arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i-1] == arr[i])
            {
                count++;
            }
            else{
                count = 1;
            }
            if(count>target) return arr[i];
        }
        return target;
    }
}