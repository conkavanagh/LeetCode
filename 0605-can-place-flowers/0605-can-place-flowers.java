class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowerCount = 0;
        if(n==0)return true;
        if(flowerbed.length==1)
        {
            if(flowerbed[0]==0)return 1==n;
            return false;
        }
        for(int i=0; i<flowerbed.length; i++)
        {
            if(i==0)
            {
                if(flowerbed[i]==0 && flowerbed[i+1]==0)
                {
                    flowerCount++;
                    flowerbed[i] = 1;
                }                   
            }
            else if(i==flowerbed.length-1)
            {
                if(flowerbed[i]==0 && flowerbed[i-1]==0)
                {
                    flowerCount++;
                    flowerbed[i] = 1;
                }
            }
            else if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0)
            {
                flowerCount++;
                flowerbed[i] = 1;
            }
        }
        return n<=flowerCount;
    }
}