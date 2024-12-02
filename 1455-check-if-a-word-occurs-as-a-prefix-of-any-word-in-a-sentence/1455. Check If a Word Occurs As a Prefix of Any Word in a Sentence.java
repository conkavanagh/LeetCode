class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int searchIndex = 0;
        int sIndex = 0;
        int currentWord = 1;
        int n = sentence.length();

        while(sIndex < n){ 
            while(sIndex < n  && sentence.charAt(sIndex) == searchWord.charAt(searchIndex)){
                sIndex++;
                searchIndex++;
                if(searchIndex >= searchWord.length()) return currentWord;
            }

            // Forward to get next prefix
            while(sIndex < n && sentence.charAt(sIndex) != ' ') sIndex++;
            currentWord++;
            searchIndex = 0;
            sIndex++;
        }
        return -1;
    }
}