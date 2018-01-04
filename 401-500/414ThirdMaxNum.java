class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        if(set.size() == 1) {
            for(Integer i:set) return i;
        }
        if(set.size() == 2){
            int max = Integer.MIN_VALUE;
            for(Integer i:set) {
                if(i > max) max = i;
            }
            return max;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(Integer i:set){
            if(i >= first) {
                third = second;
                second = first;
                first = i;
            }
            if(i < first && i >= second) {
                third = second;
                second = i;
            }
            if(i < second && i >= third) third = i;
        }
        return third;
    }
}