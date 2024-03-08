class Solution {
    public int maxFrequencyElements(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

	    // Create map
	    HashMap<Integer, Integer> numFreq = new HashMap<>();
	    for(int number : nums){
		    numFreq.put(number, numFreq.getOrDefault(number,0)+1);
        }

        // Iterate to find highest freq in map
        int highestFreq = 0;
        for(int number : numFreq.values()){
	        highestFreq = Math.max(highestFreq, number);
        }

        // Iterate through map one last time to add up the freq that are max
        int sum = 0;
        for(int number : numFreq.values()){
	        if(number == highestFreq) sum += number;
        }
        return sum; 
    }
}