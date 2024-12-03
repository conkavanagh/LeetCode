class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res = new StringBuilder();
        int index = 0;
        for(int i=0; i<spaces.length;i++){
            int currentSpace = spaces[i];
            while(index<currentSpace){
                res.append(s.charAt(index++));
            }
            res.append(" ");
        }
        while(index < s.length()) res.append(s.charAt(index++));
        return res.toString();
    }
}