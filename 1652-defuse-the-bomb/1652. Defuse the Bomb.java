class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if(k==0) return res;

        // Pos Case
        if(k>0){
            for(int i=0; i<n; i++){
                int codeNum = 0;
                for(int j=i+1; j<i+k+1; j++){
                    codeNum += code[j%n];
                }
                res[i] = codeNum;
            }
        }
        // Neg Case
        else{
            for(int i=0; i<n; i++){
                int codeNum = 0;
                int loops = 0;
                int j=i-1;
                while(loops>k){
                    codeNum += code[(((j % n) + n) % n)];
                    j--;
                    loops--;
                }
                res[i] = codeNum;
            }
        }
        return res;
    }
}