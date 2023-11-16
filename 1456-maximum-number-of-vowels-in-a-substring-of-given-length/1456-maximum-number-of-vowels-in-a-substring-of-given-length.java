class Solution {
    public boolean hasVowel(char input)
    {
        switch(input)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
            default:
        }
        return false;
    }

    public int maxVowels(String s, int k) {
        int vowelCount = 0;
        char[] str = s.toCharArray();
        for(int i=0; i<k; i++)
        {
            if( hasVowel(str[i])) vowelCount++;
        }
        int maxVowels = vowelCount;

        for(int i=k; i<str.length; i++)
        {
            if(hasVowel(str[i])) vowelCount++;
            if(hasVowel(str[i-k])) vowelCount--;
            maxVowels = Math.max(vowelCount, maxVowels);
        }
        return maxVowels;
    }
}