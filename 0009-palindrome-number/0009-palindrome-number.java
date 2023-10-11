class Solution {
    public boolean isPalindrome(int x) {
        String xList = Integer.toString(x);
        int[] number = new int[xList.length()];
        for (int i = 0; i < xList.length(); i++)
        {
            number[i] = xList.charAt(i) - '0';
        }
        for(int i=0; i<(number.length/2);i++){
            if(number[i]!=number[number.length-1-i]){
                return false;
            }
        }
        return true;
    }
}