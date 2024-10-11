class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int targetArrivalTime = times[targetFriend][0];
        int[] chairs = new int[times.length];
        Arrays.sort(times, (a,b)->a[0]-b[0]);
        int index = 0;
        int time = times[index][0];
        while(time<targetArrivalTime){
            boolean chairFound = false;
            int j=0;
            while(!chairFound){
                // If chair is empty or time is after chair was vacated
                if(chairs[j] == 0 || chairs[j] <= time){
                    chairs[j] = times[index][1]; // Log leave time
                    chairFound = true;
                }
                j++;
            }
            time = times[++index][0];
        }
        for(int i=0; i<chairs.length; i++){
            if(chairs[i] == 0 || chairs[i] <= targetArrivalTime) return i;
        }

        return -1;
    }
}