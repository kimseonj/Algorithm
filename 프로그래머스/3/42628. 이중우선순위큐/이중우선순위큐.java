import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (String operation : operations) {
            char command = operation.charAt(0);
            int value = Integer.parseInt(operation.substring(2));
            
            if (command == 'I') {
                map.put(value, map.getOrDefault(value, 0) + 1);
                continue;
            }
            
            if (map.isEmpty()) {
                continue;
            }
            
            if (value == 1) {
                int max = map.lastKey();
                remove(map, max);
            }
            
            if (value == -1) {
                int min = map.firstKey();
                remove(map, min);
            }
        }
        
        if (map.isEmpty()) {
            return new int[]{0, 0};
        }
        
        return new int[]{map.lastKey(), map.firstKey()};
    }
    
    private void remove(TreeMap<Integer, Integer> map, int key) {
        int count = map.get(key);
        
        if (count == 1) {
            map.remove(key);
        } else {
            map.put(key, count - 1);
        }
    }
}