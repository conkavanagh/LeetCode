class Solution {
    public int maxDepth(String s) {
        s = s.replaceAll("[^()]", "");
        System.out.println(s);
        int maxDepth = 0;
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ')') stk.pop();
            else{
                stk.push(')');
            }
            maxDepth = Math.max(maxDepth, stk.size());
        }
        return maxDepth;
    }
}