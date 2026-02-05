class MyHashSet {
    HashMap<Integer,Integer> map; 
    public MyHashSet() {
        map= new HashMap<>();
    }
    
    public void add(int key) {
        if(!map.containsKey(key)){
            map.put(key,0);
        }
    }
    
    public void remove(int key) {
        if(map.containsKey(key)){
            map.remove(key);
        }
    }
    
    public boolean contains(int key) {
        return map.containsKey(key);
    }
}
