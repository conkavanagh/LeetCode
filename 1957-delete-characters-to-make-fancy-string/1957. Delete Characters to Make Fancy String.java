class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        if(s.length() < 2) return s;
        int index = 2;
        res.append(s.charAt(0));
        res.append(s.charAt(1));
        while(index<s.length()){
            if(s.charAt(index) != s.charAt(index-1) || s.charAt(index) != s.charAt(index-2)){
                res.append(s.charAt(index));
            }
            index++;
        }
        return res.toString();
    }
}