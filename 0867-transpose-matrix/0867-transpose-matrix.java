class Solution {
    public int[][] transpose(int[][] matrix) {
        // take int[0][i] and add int[i][0]
        int[][] res = new int[matrix[0].length][matrix.length];
        for(int i = 0; i<matrix.length; i++)
        {
            for(int j =0; j<matrix[0].length; j++ )
            {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}