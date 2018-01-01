class Solution {
    public List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex + 1;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows == 0) return res.get(rowIndex);
        ArrayList<Integer> row0 = new ArrayList<>();
        row0.add(1);
        res.add(row0);
        if(numRows == 1) return res.get(rowIndex);
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(1);
        res.add(row1);
        for(int i = 2; i < numRows; i++){
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j < i; j++){
                row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            row.add(1);
            res.add(row);
        }
        return res.get(rowIndex);
    }
}