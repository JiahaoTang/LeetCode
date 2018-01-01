class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] newNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            newNums[i] = nums[i];
        }
        Arrays.sort(newNums);
        int pre = 0;
        int back = nums.length - 1;
        while(pre < nums.length && newNums[pre] == nums[pre]){
            pre++;
        }
        while(back >= 0 && newNums[back] == nums[back]){
            back--;
        }
        if(pre >= back) return 0;
        else return back - pre + 1;
    }
}