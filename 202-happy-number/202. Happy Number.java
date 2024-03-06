class Solution {
    public boolean isHappy(int n) {
        // Use a set to track previous numbers
        Set<Integer> set = new HashSet<>();
        while(n != 1){
            // We're in a loop
            if(set.contains(n)) return false;
            set.add(n);
            char[] num = (""+n).toCharArray();
            n = 0;
            for(char c : num){
                n += Math.pow((c-'0'),2);
            } 
        }
        return true;
    }
}