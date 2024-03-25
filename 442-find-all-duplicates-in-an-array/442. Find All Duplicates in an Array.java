class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dups = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) dups.add(i);
            else set.add(i);
        }
        return dups;
    }
}