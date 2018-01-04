class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        double avg = (double) sum / k;
        double max = avg;
        for(int i = k; i < nums.length; i++){
            avg = (double) (avg * k - nums[i - k] + nums[i]) / k;
            if(avg > max) max = avg;
        }
        return max;
    }
}