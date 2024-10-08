class Solution {
    public int[] replaceElements(int[] arr) {
        // Start from right and record max
        int currentMax=arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i = arr.length-2; i>=0; i--){
            int toReplace = currentMax;
            currentMax = Math.max(currentMax, arr[i]);
            arr[i] = toReplace;
        }
        return arr;
    }
}