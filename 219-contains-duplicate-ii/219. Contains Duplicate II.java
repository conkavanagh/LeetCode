class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<=1 || k == 0 || nums==null) return false;

        HashMap<Integer, Integer> map = new HashMap<>();

	    for(int i=0; i<nums.length; i++){
		    // Check if dup is present
		    if(map.containsKey(nums[i])){
			    if(Math.abs(map.get(nums[i])-i)<=k) return true;
			    map.remove(nums[i]);
		    }
            map.put(nums[i],i);
        }
	    return false;
    }
}