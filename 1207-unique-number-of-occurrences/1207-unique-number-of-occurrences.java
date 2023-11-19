class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i : arr) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }
        return new HashSet<>(counts.values()).size() == counts.size();
    }
}