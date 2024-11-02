class Solution {
    public boolean isCircularSentence(String sentence) {
        // Check first and last letters
        if(sentence.charAt(0) != sentence.charAt(sentence.length()-1)) return false;
        // Find spaces
        for(int i=1; i<sentence.length()-1; i++){
            // Check letters
            if(sentence.charAt(i) == ' ' && sentence.charAt(i-1) != sentence.charAt(i+1))
                return false;
        }
        //End reached
        return true;
    }
}