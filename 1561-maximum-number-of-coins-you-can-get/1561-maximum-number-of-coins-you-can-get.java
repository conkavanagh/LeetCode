class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i = piles.length/3;
        int res = 0;
        while(i<piles.length)
        {
            res +=piles[i];
            i +=2;
        }
        return res;
    }
}