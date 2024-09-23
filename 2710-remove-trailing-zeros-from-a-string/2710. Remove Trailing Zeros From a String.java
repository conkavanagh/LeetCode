class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder res = new StringBuilder();
        res.append(num);
        for(int i = num.length()-1; i>0; i--){
            if(res.charAt(i) == '0'){
                res.deleteCharAt(i);
            }
            else{
                return res.toString();
            }
        }
        return res.toString();
    }
}