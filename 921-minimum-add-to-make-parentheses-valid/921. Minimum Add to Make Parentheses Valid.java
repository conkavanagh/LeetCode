class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int toChange = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '(') stack.push(')');
            else{
                if(!stack.isEmpty()) stack.pop();
                else{
                    toChange++;
                }
            }
        }
        return toChange+=stack.size();
    }
}