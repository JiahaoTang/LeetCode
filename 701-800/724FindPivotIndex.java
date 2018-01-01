class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return nums.length;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(0 == sum - nums[0]) return 0;
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
            if(nums[i - 1] == sum - nums[i]) return i;
        }
        return -1;
    }
}