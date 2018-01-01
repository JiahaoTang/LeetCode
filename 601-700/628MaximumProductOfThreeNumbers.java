class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int haveNegativeProduct = nums[0] * nums[1] * nums[nums.length - 1];
        int positiveProduct = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        return Math.max(haveNegativeProduct, positiveProduct);
    }
}