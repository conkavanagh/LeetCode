class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        int n1 = word1.length();
        int n2 = word2.length();
        char[] arr1=word1.toCharArray(); char[] arr2=word2.toCharArray();
        int count1 = 0; int count2 = 0;
        for(int i=0; i<n1+n2; i++)
        {
            if(count1<n1 && count2<n2) // alternate
            {
                if(i%2==0)
                {
                    merged +=arr1[count1];
                    count1++;
                }
                else{
                    merged +=arr2[count2];
                    count2++;
                }
            }
            else if (count1<n1) //2nd word done
            {
                merged +=arr1[count1];
                count1++;
            }
            else if (count2<n2) //1st word done
            {
                merged +=arr2[count2];
                count2++;
            }
        }
        return merged;
    }
}