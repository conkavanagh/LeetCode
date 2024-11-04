class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int i=0;
        while(i<word.length()){
            int count = 0;
            int index = i;
            while(index<word.length() && count<9 && word.charAt(i) == word.charAt(index)){
                index++;
                count++;
            }
            comp.append(count);
            comp.append(word.charAt(i));
            i = index;
        }
        return comp.toString();
    }
}