class Solution 
{
    public int candy(int[] ratings) 
    {
        int amount = ratings.length;
        int[] candyAmounts = new int[amount];
        for (int i=1; i<ratings.length; i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                candyAmounts[i] = candyAmounts[i-1]+1;
            }

        }
        for(int i=ratings.length-2; i>=0; i--)
        {
            if(ratings[i]>ratings[i+1])
            {
                if(candyAmounts[i]<=candyAmounts[i+1])
                {
                    candyAmounts[i] = candyAmounts[i+1]+1;
                }
                else if(candyAmounts[i]<=candyAmounts[i-1])
                {
                    candyAmounts[i] = candyAmounts[i-1]+1;
                }
            }
        }
        for(int i = 0; i<candyAmounts.length; i++)
        {
            amount = amount+candyAmounts[i];
        }
        return amount;
    }
}