/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        if(nums.length == 1) return new TreeNode(nums[0]);
        TreeNode res = new TreeNode(nums[nums.length / 2]);
        int[] left = new int[nums.length / 2];
        int[] right = new int[nums.length - nums.length / 2 - 1];
        for(int i = 0; i < left.length; i++){
            left[i] = nums[i];
        }
        for(int i = nums.length / 2 + 1; i < nums.length; i++){
            right[i - nums.length / 2 - 1] = nums[i];
        }
        res.left = sortedArrayToBST(left);
        res.right = sortedArrayToBST(right);
        return res;
    }
}