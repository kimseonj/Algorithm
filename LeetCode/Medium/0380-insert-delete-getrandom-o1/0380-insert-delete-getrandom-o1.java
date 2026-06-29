class RandomizedSet {
    private final Map<Integer, Integer> map;
    private final List<Integer> list;
    private final Random random = new Random();

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        
        int removeIndex = map.get(val);
        int lastIndex = list.size() - 1;
        int lastVal = list.get(lastIndex);

        list.set(removeIndex, lastVal);
        map.put(lastVal, removeIndex);

        list.remove(lastIndex);
        map.remove(val);
        
        return true;
    }
    
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */