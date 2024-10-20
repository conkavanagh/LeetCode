class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int index = 0;
        int amount = 1;
        int[] res = new int[num_people];
        while(candies>0){
            if(index>=num_people) index = 0;
            res[index++] += Math.min(candies, amount);
            candies -= amount++;
        }
        return res;
    }
}