class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        HashSet<Character> set = new HashSet<>();
        int ind = 0;

        while(ind<s.length() && !set.contains(s.charAt(ind))){
            set.add(s.charAt(ind));
            ind++;
        }
        int max = set.size();

        while(ind<s.length()){
            if(!set.contains(s.charAt(ind))){
                set.add(s.charAt(ind));
                ind++;
            }
            else{
                set.remove((s.charAt(ind - set.size())));
            }
            max = Math.max(max, set.size());
        }
        return max;
    }
}