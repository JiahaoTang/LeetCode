class Solution {
    public String intToRoman(int num) {
        int[] digit = intToDigit(num);
        StringBuilder sb = new StringBuilder();
        if(digit[0] > 0 && digit[0] <= 3){
            for(int i = 0; i < digit[0]; i++){
                sb.append('M');
            }
        }
        //for hundred digit
        if(digit[1] > 0 && digit[1] <= 3){
            for(int i = 0; i < digit[1]; i++){
                sb.append('C');
            }
        }
        if(digit[1] == 4){
            sb.append("CD");
        }
        if(digit[1] > 4 && digit[1] <= 8){
            sb.append('D');
            for(int i = 5; i < digit[1]; i++){
                sb.append('C');
            }
        }
        if(digit[1] == 9){
            sb.append("CM");
        }
        //for ten digit
        if(digit[2] > 0 && digit[2] <= 3){
            for(int i = 0; i < digit[2]; i++){
                sb.append('X');
            }
        }
        if(digit[2] == 4){
            sb.append("XL");
        }
        if(digit[2] > 4 && digit[2] <= 8){
            sb.append('L');
            for(int i = 5; i < digit[2]; i++){
                sb.append('X');
            }
        }
        if(digit[2] == 9){
            sb.append("XC");
        }
        //for one digit
        if(digit[3] > 0 && digit[3] <= 3){
            for(int i = 0; i < digit[3]; i++){
                sb.append('I');
            }
        }
        if(digit[3] == 4){
            sb.append("IV");
        }
        if(digit[3] > 4 && digit[3] <= 8){
            sb.append('V');
            for(int i = 5; i < digit[3]; i++){
                sb.append('I');
            }
        }
        if(digit[3] == 9){
            sb.append("IX");
        }
        return sb.toString();
    }
    
    public int[] intToDigit(int num){
        int[] res = new int[4];
        int divider = 1000;
        for(int i = 0; i < 4; i++){
            res[i] = num / divider;
            num %= divider;
            divider /= 10;
        }
        return res;
    }
}