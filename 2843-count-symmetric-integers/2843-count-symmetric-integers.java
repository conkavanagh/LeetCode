class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i = low; i<=high; i++){
            String temp = Integer.toString(i);
            int[] numArray = new int[temp.length()];
            for(int j = 0; j < temp.length();j++){
                numArray[j] = temp.charAt(j) - '0';
            }
            if((numArray.length)%2==0){ //even
                int n = (numArray.length)/2;
                int num1 = 0; int num2=0;
                for(int k = 0; k<n;k++){
                    num1+=numArray[k];
                }
                for(int k = n; k<2*n;k++){
                    num2+=numArray[k];
                }
                if(num1==num2){
                    count++;
                }
            }
        }
        return count;
    }
}