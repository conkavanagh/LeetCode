class Solution {
    public int minAddToMakeValid(String s) {
        int toChange = 0;
        int open = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '(') open++;
            else{
                if(open>0) open--;
                else{
                    toChange++;
                }
            }
        }
        return toChange+=open;
    }
}