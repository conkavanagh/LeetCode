class Solution {
    public String reorderSpaces(String text) {
        int spaceCount = 0;
        for(char letter : text.toCharArray()){
            if(letter == ' ') spaceCount++;
        }
        String[] words = text.trim().split("\\s+");
        int wordCount = words.length;
        int spacesPer, remainder;
        if(wordCount == 1){
            spacesPer = 0;
            remainder = spaceCount;
        }
        else{
            spacesPer = spaceCount/(wordCount-1);
            remainder = spaceCount%(wordCount-1);
        }
        StringBuilder res = new StringBuilder();
        res.append(words[0]);
        for(int i = 1; i<words.length; i++){
            for(int j=0; j<spacesPer; j++) res.append(" ");
            res.append(words[i]);
        }
        for(int i=0; i<remainder; i++) res.append(" ");
        return res.toString();
    }
}