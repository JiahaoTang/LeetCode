class Solution {
    public boolean canPermutePalindrome(String s) {
        char[] letters = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < letters.length; i++){
            if(!map.containsKey(letters[i])){
                map.put(letters[i], 1);
            }else{
                map.put(letters[i], map.get(letters[i]) + 1);
            }
        }
        boolean hasOdd = false;
        for(Character l:map.keySet()){
            if(map.get(l) % 2 == 1 && hasOdd == true) return false;
            else if(map.get(l) % 2 == 1) hasOdd = true;
        }
        return true;
    }
}