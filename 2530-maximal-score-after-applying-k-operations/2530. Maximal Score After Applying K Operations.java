class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums) pq.add(num);

        long score = 0;
        for(int i=0; i<k; i++){
            int currentMax = pq.poll();
            score += currentMax;
            pq.add((int) Math.ceil(currentMax/3.0));
        }
        return score;
    }
}