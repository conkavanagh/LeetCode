class Solution {
    public String maximumOddBinaryNumber(String s){ 
	    // Iterate through the string, get the amount of 1s. 
	    // The amount of 0s will therefore equal length - #1s
	    // Build a string with one one in the LSB, and the rest of the // 1st filling in from the MSB
	    int oneCount = 0;

	    // Get number of 1s in string
	    for(int i=0; i<s.length(); i++){
		    if(s.charAt(i) == '1'){
                oneCount++;
            }
        }

        // Build the string with 1s first whilt the number of 1s left // is greater than 1.
        StringBuilder maxOddNum = new StringBuilder();
        for(int i=0; i<s.length()-1; i++){ 
	        if(oneCount>1){ 
                maxOddNum.append("1");
                oneCount--;
            }
	        else{
		        maxOddNum.append("0");
            }
        }

        // Append the last 1
        maxOddNum.append("1");
        return maxOddNum.toString();
    }

}