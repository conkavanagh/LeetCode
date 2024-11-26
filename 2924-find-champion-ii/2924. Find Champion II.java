class Solution {
    public int findChampion(int n, int[][] edges) {
        Set<Integer> tops = new HashSet<>();
        Set<Integer> bottoms = new HashSet<>();

        for(int i=0; i<n; i++) tops.add(i);
        for(int i=0; i<edges.length; i++){
            //tops.add(edges[i][0]);
            bottoms.add(edges[i][1]);
        }

        // Check if any values that appear in tops dont appear in bottoms
        ArrayList<Integer> winners = new ArrayList<>();

        for(int top : tops){
            if(!bottoms.contains(top)) winners.add(top);
        }

        if(winners.size() == 1) return winners.get(0);

        return -1;
    }
}