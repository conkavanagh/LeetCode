class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] tArr = t.toCharArray();
        char[] sArr = s.toCharArray();
        boolean currentFound = false;
        int currentIndex=0;

        for (int i = 0; i<sArr.length; i++)
        {
            currentFound = false;
            int j = currentIndex;
            while (j< tArr.length && !currentFound)
            {
               if(sArr[i] == tArr[j])
               {
                   currentFound = true;
               }
               currentIndex++;
               j++;
            }
            if (!currentFound)
            {
                return false;
            }
        }
        return true;
    }
}