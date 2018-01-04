class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1 ){
            if(flowerbed[0]==0 && n <= 1) return true;
            else if(flowerbed[0]==1 && n <= 0) return true;
            else return false;
        }
        int preZero = 0;
        int i = 0;
        while(i < flowerbed.length && flowerbed[i] != 1) {
            preZero++;
            i++;
        }
        if(preZero == flowerbed.length){
            if(n <= preZero / 2 && preZero % 2 == 0) return true;
            else if(n <= preZero / 2 + 1 && preZero % 2 == 1) return true;
            else return false;
        }
        int backZero = 0;
        int j = flowerbed.length - 1;
        while(j >= 0 && flowerbed[j] != 1){
            backZero++;
            j--;
        }
        int canPlaced = preZero / 2 + backZero / 2;
        for(int m = i; m <= j; m++){
            if(flowerbed[m] == 0 && flowerbed[m - 1] == 0 && flowerbed[m + 1] == 0){
                flowerbed[m] = 1;
                canPlaced++;
            }
        }
        return canPlaced >= n;
    }
}