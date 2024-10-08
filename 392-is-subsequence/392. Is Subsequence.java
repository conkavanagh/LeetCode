class Solution {
    public boolean isSubsequence(String s, String t) {
        int tIndex = 0;
        int sIndex = 0;
        // empty string is a subsequence
        if(s.length() == 0) return true;
        
        while(tIndex<t.length())
        {
            if(s.charAt(sIndex) == t.charAt(tIndex))
            {
                sIndex++;
            }
            tIndex++;
            if(sIndex>=s.length()) return true;
        }
        return false;
    }
}