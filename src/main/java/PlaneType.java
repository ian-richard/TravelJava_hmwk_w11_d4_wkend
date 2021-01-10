public enum PlaneType {
    BOEING747(3, 150),
    AIRBUSA380(150, 300);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() { return capacity;}
    
    public int getWeight() { return weight;}



}
