class Solution {
    public int minimumLength(String s) {
	    int prefixIndex = 0;
	    int suffixIndex = s.length()-1;
	    while(prefixIndex<suffixIndex && s.charAt(prefixIndex)==s.charAt(suffixIndex)){
            char currentLetter = s.charAt(prefixIndex);
            prefixIndex++;
            
		    while(prefixIndex <= suffixIndex &&  s.charAt(prefixIndex) == currentLetter)
            {
			    prefixIndex++;
            }
            while(prefixIndex <= suffixIndex && s.charAt(suffixIndex) == currentLetter)
            {
	            suffixIndex--;
            }
        }
        return suffixIndex - prefixIndex +1;
    }

}