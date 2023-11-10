class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> greatest = new ArrayList<Boolean>();
        for(int i : candies) // Find max
        {
            if ( i > max) max = i;
        }
        for(int i : candies) // Check if greatest
        {
            if(i + extraCandies >= max) greatest.add(true);
            else greatest.add(false);
        }
        return greatest;
    }
}