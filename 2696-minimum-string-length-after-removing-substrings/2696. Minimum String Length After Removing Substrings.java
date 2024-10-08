class Solution {
    public int minLength(String s) {
        // Build final string in stack, if we push the 1st char of pattern and the 
        // next char is the 2nd char of pattern we pop off the 1st char
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length();i++){
            char currentChar = s.charAt(i);

            if(stack.isEmpty()){
                stack.push(currentChar);
                continue;
            }

            if(currentChar == 'B' && stack.peek() == 'A') stack.pop();
            else if(currentChar == 'D' && stack.peek() == 'C') stack.pop();
            else{
                stack.push(currentChar);
            }
        }
        return stack.size();
    }
}