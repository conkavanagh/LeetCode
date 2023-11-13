class Solution {
    public boolean isVowel(char s)
    {
        switch(s){
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
    public String sortVowels(String s) {
        char[] str = s.toCharArray();
        PriorityQueue<Character> pq = new PriorityQueue<Character>();
        Queue<Integer> vowelIndex = new LinkedList<>();
        for(int i = 0; i<str.length; i++)
        {
            if(isVowel(str[i]))
            {
                pq.add(str[i]);
                vowelIndex.add(i);
            }
        }
        while(vowelIndex.peek()!=null)
        {
            str[vowelIndex.poll()] = pq.poll();
        }
        return String.valueOf(str);
    }
}