class TwoSum {
    ArrayList<Integer> list;
    /** Initialize your data structure here. */
    public TwoSum() {
        list = new ArrayList<>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        list.add(number);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < list.size(); i++){
            if(set.contains(value - list.get(i))) return true;
            else set.add(list.get(i));
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */