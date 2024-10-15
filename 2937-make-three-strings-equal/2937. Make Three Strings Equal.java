class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        // LCP
        int index = 0;
        int min = Math.min(s1.length(),s2.length());
        min = Math.min(min,s3.length());
        while(index<min && s1.charAt(index) == s2.charAt(index) 
        && s1.charAt(index) == s3.charAt(index)){
            index++;
        }
        if(index==0) return -1;
        return s1.length()+s2.length()+s3.length()-(index*3);

    }
}