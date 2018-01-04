class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] res = new int[cost.length];
        res[0] = cost[0];
        res[1] = cost[1];
        for(int i = 2; i < cost.length; i++){
            res[i] = cost[i] + Math.min(res[i - 1], res[i - 2]);
        }
        return Math.min(res[cost.length - 2], res[cost.length - 1]);
    }
}