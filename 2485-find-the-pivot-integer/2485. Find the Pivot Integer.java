class Solution {
    private double sum(int n){
        return ((n)*(n+1))/2;
    }

    public int pivotInteger(int n) {
        for(int i = 1; i<=n;i++){
            if(sum(n)-sum(i-1) == sum(i)) return i;
        }
        return -1;
    }
}