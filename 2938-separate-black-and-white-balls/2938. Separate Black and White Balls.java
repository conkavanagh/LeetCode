class Solution {
    public long minimumSteps(String s) {
        long total=0;
        int count = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == '0') count++;
            else{
                total+=count;
                //count = 0;
            }
        }
        return total;
    }
}