class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int counter = 0;
        
        for(int i = 0; i < points.length; i++){
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int j = 0; j < points.length; j++){
                int d = distance(points[i], points[j]);
                if(!map.containsKey(d)){
                    map.put(d, 0);
                }
                counter += map.get(d);
                map.put(d ,map.get(d) + 1);
            }
        }
        return counter * 2;
    }
    
    public int distance(int[] p1, int[] p2){
        return (int)Math.pow(p1[0] - p2[0], 2) + (int)Math.pow(p1[1] - p2[1], 2);
    }
}