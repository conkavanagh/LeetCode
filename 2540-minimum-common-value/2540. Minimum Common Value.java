class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int ind1 = 0;
        int ind2 = 0;
        while(ind1<nums1.length && ind2<nums2.length){
            if(nums1[ind1] < nums2[ind2]) ind1++;
            else if(nums1[ind1] > nums2[ind2]) ind2++;
            else{
                return nums1[ind1];
            }
        }
        return -1;
    }
}