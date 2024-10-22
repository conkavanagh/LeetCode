class Solution {
    public int passThePillow(int n, int time) {
        int comp = time/(n-1);
        // From left
        if(comp % 2 == 0) 
            return time % (n-1) + 1;
        // From right
        return n - time % (n-1);
    }
}