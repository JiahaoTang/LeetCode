class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(num);
        Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();

        for(int i = 0; i < num.length - 2; i++){
            int low = i + 1;
            int high = num.length - 1;
            while(low < high){
                if(num[low] + num[high] + num[i] == 0){
                    ArrayList<Integer> tuple = new ArrayList<>();
                    tuple.add(num[i]);
                    tuple.add(num[low]);
                    tuple.add(num[high]);
                    
                    if(!set.contains(tuple)) {
                        res.add(tuple);
                        set.add(tuple);
                    }
                       
                    low++;
                    high--;
                }
                else if(num[low] + num[high] + num[i] > 0) high--;
                else low++;
            }
        }
        return res;
    }
}