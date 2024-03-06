class Solution {
    public int[] sortedSquares(int[] nums){
	    int leftIndex = 0; int rightIndex = nums.length-1;
        int[] result = new int[nums.length];	
	    int resultIndex = nums.length-1;

	    while(leftIndex<=rightIndex){
		    int leftSquare = (int)Math.pow(nums[leftIndex],2);
		    int rightSquare = (int)Math.pow(nums[rightIndex],2);

		    if(leftSquare>rightSquare){
			    result[resultIndex--] = leftSquare;
			    leftIndex++;
            }
            else{
	            result[resultIndex--] = rightSquare;
	            rightIndex--;
            }
	    }
	    return result;
    }

}