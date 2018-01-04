class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for(int i = 0 ; i <= num; i++){
            String number = Integer.toBinaryString(i);
            int counter = 0;
            for(int j = 0; j < number.length(); j++){
                if(number.charAt(j) == '1') counter++;
            }
            res[i] = counter;
        }
        return res;
    }
}