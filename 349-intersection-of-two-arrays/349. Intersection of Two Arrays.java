class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        int[] res = new int[Math.max(nums1.length,nums2.length)];
        int index=0;
        for(int i : nums2){
            if(set.contains(i)){
                res[index++] = i;
                set.remove(i);
            }
        }
        return Arrays.copyOf(res, index);
    }
}