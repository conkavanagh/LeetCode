class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> noGo = new HashSet<>();
        for(int i=0; i<banned.length; i++) noGo.add(banned[i]);

        int sum = 0;
        int i = 1;
        int count = 0;
        while(sum<=maxSum){
            if(i > n) return count;
            if(!noGo.contains(i)){
                System.out.println("Added: "+i);
                sum+=i;
                count++;
            }
            i++;
        }
        return count-1;
    }
}