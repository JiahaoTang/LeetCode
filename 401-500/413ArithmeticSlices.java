class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length < 3) return 0;
        int[] diff = new int[A.length - 1];
        for(int i = 0; i < diff.length; i++){
            diff[i] = A[i + 1] - A[i];
        }
        int counter = 0;
        int pre = 0;
        int back = 0;
        while(pre < diff.length && back < diff.length){
            if(diff[back] == diff[pre]) {
                if(back == diff.length - 1 && back - pre >= 1){
                    counter += (back - pre + 2 - 2) * (back - pre + 1) / 2;
                }
                back++;
            }
            else if(diff[back] != diff[pre]){
                if(back - pre >= 2) counter += (back - pre + 1 - 2) * (back - pre) / 2;
                pre = back;
            }
        }
        return counter;
    }
}