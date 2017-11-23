class Solution {
    public String frequencySort(String s) {
        if(s == null) return null;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
            else map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        
        TreeMap<Integer, ArrayList<Character>> tm = new TreeMap<>();
        for(Character c:map.keySet()){
            if(!tm.containsKey(map.get(c))) {
                ArrayList<Character> list = new ArrayList<>();
                list.add(c);
                tm.put(map.get(c), list);
            }
            else tm.get(map.get(c)).add(c);
        }
        
        StringBuilder res = new StringBuilder();
        while(!tm.isEmpty()){
            int times = tm.lastKey();
            ArrayList<Character> temp = tm.get(times);
            for(Character c:temp){
                for(int i = 0; i < times; i++) res.append(c);
            }
            tm.remove(times);
        }
        return new String(res);
    }
}