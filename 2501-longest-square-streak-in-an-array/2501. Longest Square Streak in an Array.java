class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer> numList = new HashSet<>();
        for(int num : nums) numList.add(num);
        int maxStreak = 0;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            int streak = 0;
            int square = nums[i];
            while(numList.contains(square)){
                streak++;
                numList.remove(square);
                square = square*square;
            }
            maxStreak = Math.max(maxStreak, streak);
        }
        if(maxStreak == 1) return -1;
        return maxStreak;
    }
}