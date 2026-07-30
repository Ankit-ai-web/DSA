class MyHashSet {
    private boolean[] obj;

    public MyHashSet() {
        obj  = new boolean[1000001];
    }
    
    public void add(int key) {
        obj[key] = true;
    }
    
    public void remove(int key) {
        obj[key] = false;
    }
    
    public boolean contains(int key) {
       return obj[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */