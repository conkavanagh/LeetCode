class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        if(s.length() == 0) return true;
        int sInd = 0, tInd = 0;

        while(tInd < t.length()){
            if(s.charAt(sInd) == t.charAt(tInd)){
                sInd++;
                if(sInd == s.length()) return true;
            }
            tInd++;
        }
        return false;
    }
}