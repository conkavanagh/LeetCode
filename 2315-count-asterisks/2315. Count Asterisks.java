class Solution {
    public int countAsterisks(String s) {
        boolean include = true;
        int count = 0;
        char[] str = s.toCharArray();
        for(char letter : str){
            if(letter == '|') include = !include;
            if(include && letter == '*') count++;
        }
        return count;
    }
}