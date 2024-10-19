class Solution {
    public char findKthBit(int n, int k) {
        if(n==1) return '0';

        int len = (1 << n) -1;
        int mid = len/2+1;

        // Find the bit in Sn-1
        if(k < mid) return findKthBit(n-1, k);
        // Find the bit in Sn-1 + invert
        if(k > mid) return findKthBit(n-1, len-k+1) == '0' ? '1' : '0';
        // In middle, return 1
        return '1';
    }
}