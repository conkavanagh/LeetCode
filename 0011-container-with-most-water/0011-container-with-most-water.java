class Solution {
    public int maxArea(int[] height) {
        int currentMaxVol = 0;
        int left = 0; int right = height.length-1;
        if(height.length <2)return 0;
        if(height.length ==2)return Math.min(height[0],height[1]);
        /*
        for(int i=0; i<height.length-1;i++)
        {
            for(int j=i+1; j<height.length; j++)
            {
                int testVol = Math.min(height[i],height[j])*(j-i);
                if(testVol>currentMaxVol) currentMaxVol = testVol;
            }
        }
        */
        while(left<right){
            int testVol = Math.min(height[left],height[right])*(right-left);
            if(testVol>currentMaxVol) currentMaxVol = testVol;
            if(height[left]<=height[right]) left++;
            else right--;
        }
        return currentMaxVol;
    }
}