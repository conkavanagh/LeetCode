class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        String full = s+s;
        if(full.contains(goal)) return true;
        return false;
    }
}