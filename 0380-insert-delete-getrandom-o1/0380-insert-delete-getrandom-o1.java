class RandomizedSet {
    private Set<Integer> set = new HashSet<>();  
    private Random rand = new Random();

    public RandomizedSet() {
 
    }
    
    public boolean insert(int val) {
        if(checkIfPresent(val)){
            return false;
        }
        set.add(val);
        return true;   
    }
    
    public boolean remove(int val) {
        if(!checkIfPresent(val)){
            return false;
        }
        set.remove(val);
        return true;  
    }
    
    public int getRandom() {
        if(set.isEmpty()) return 0;
        List<Integer> list = new ArrayList<>(set);
        rand = new Random();
        return list.get(rand.nextInt(list.size()));  
    }
    private boolean checkIfPresent(int val){
        if(set.contains(val)){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */