class Solution {
    public int reverse(int x) {
        String num = "";
        boolean negative = false;
        if (x<0){
            x = x*-1;
            negative = true;
        }
        while (x > 0) {
            num = num+(x % 10);
            x = x / 10;
        }
        if (num == ""){
            num = "0";
        }
        try{
            if(negative){
                int y = Integer.parseInt(num);
                return -1*y;
            }
            return Integer.parseInt(num);
        }
        catch(NumberFormatException e){
            return 0;
        }
        
    }
}