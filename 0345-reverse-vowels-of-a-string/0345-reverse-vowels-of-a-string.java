class Solution {
    public String reverseVowels(String s) {
        Stack<Character> q = new Stack<Character>();
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i<s.length();i++)
        {
            if(checkVowel(s.charAt(i)))
            {
                q.push(s.charAt(i));
                indexes.add(i);
            }
        }
        
        for(int i = 0; i<indexes.size(); i++)
        {
            s = s.substring(0, indexes.get(i)) + q.pop() + s.substring(indexes.get(i)+1);
        }
        return s;
    }
    
    public boolean checkVowel(char c){
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
        }
        return false;
    }
}