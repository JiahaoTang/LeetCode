class NumArray {
    int[] sum;
    int[] originNums;
    
    public NumArray(int[] nums) {
        sum = new int[nums.length];
        originNums = new int[nums.length];
        for(int i = 0; i < originNums.length; i++){
            originNums[i] = nums[i];
        }
        for(int i = 0; i < sum.length; i++){
            if(i == 0) sum[i] = nums[i];
            else sum[i] = nums[i] + sum[i - 1];
        }
    }
    
    public int sumRange(int i, int j) {
        return sum[j] - sum[i] + originNums[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */