class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        sum[1] = nums[1];
        for(int i = 2; i < nums.length; i++){
            int max = 0;
            for(int j = 0; j < i - 1; j++){
                if(sum[j] > max) max = sum[j];
            }
            sum[i] = nums[i] + max;
        }
        return Math.max(sum[nums.length - 1], sum[nums.length - 2]);
    }
}