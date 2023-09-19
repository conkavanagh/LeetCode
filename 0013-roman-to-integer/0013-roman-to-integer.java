class Solution {
    public int romanToInt(String s) {
        int total = 0;
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        
        for ( int i = 0; i<arr.length; i++){
            if(arr[i] == 'I'){
                if(i<arr.length-1){
                    if(arr[i+1] == 'V'){
                        total += 4;
                        i++;
                    }
                    else if(arr[i+1] == 'X'){
                       total +=9;
                       i++;
                    }
                    else{
                        total+=1;
                    }
                }
                else{
                    total+=1;
                }
            }
            else if(arr[i] == 'V'){
                total+=5;
            }
            else if(arr[i] == 'X'){
                if(i<arr.length-1){
                    if(arr[i+1] == 'L'){
                        total+=40;
                        i++;
                    }
                    else if(arr[i+1] == 'C'){
                        total+=90;
                        i++;
                    }
                    else{
                        total+=10;
                    }
                }
                else{
                    total+=10;
                }
            }
            else if(arr[i] == 'L'){
                total+=50;
            }
            else if(arr[i] == 'C'){
                if(i<arr.length-1){
                    if(arr[i+1] == 'D'){
                        total+=400;
                        i++;
                    }
                    else if(arr[i+1] == 'M'){
                        total+=900;
                        i++;
                    }
                    else{
                        total+=100;
                    }
                }
                else{
                    total+=100;
                }
            }
            else if(arr[i] == 'D'){
                total+=500;
            }
            else if(arr[i] == 'M'){
                total+=1000;
            }
            else{
                return -1;
            }
        }
        return total;
    }
}