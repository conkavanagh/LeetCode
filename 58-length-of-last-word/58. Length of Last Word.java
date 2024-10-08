class Solution {
    public int lengthOfLastWord(String s) {
       boolean wordFound = false;
       char[] chr = s.toCharArray();
       int index = chr.length-1;
       int length = 0;
       while(!wordFound && index>=0)
       {
           if(chr[index--] != 32)
           {
               length++;
           }
           else if(length>0)
           {
               wordFound = true;
           }
       }
       return length;
    }
}