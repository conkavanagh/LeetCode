class Solution{
    public String longestCommonPrefix(String[] strs) {
        char[] baseString = strs[0].toCharArray();
        int lcp = 201;
        for(int i = 1; i< strs.length; i++){
            int j = 0;
            char[] compString = strs[i].toCharArray();
            boolean k = true;
            try{
                while(k){
                    if(baseString[j] == compString[j]){
                        j = j+1;
                    }
                    else{
                        k = false;
                    }
                }    
            }
            catch (ArrayIndexOutOfBoundsException e){

            }

            if(j<lcp ){
                lcp = j;
            }
        }
        String prefix = "";
        try{
            for(int i = 0; i<lcp; i++)
            {
                prefix = prefix+baseString[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e){}

        return prefix;
    }
}