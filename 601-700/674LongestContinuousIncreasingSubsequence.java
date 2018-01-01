class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return nums.length;
        int maxLen = 0;
        int counter = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1] && i != nums.length - 1) counter++;
            else if(nums[i] > nums[i - 1] && i == nums.length - 1){
                counter ++;
                maxLen = Math.max(counter, maxLen);
            } else {
                maxLen = Math.max(counter, maxLen);
                counter = 1;
            }
        }
        return maxLen;
    }
}