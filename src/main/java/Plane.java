public class Plane {


    private PlaneType planeType;


    public Plane(PlaneType planeType) {
        this.planeType = planeType;

    }

    public PlaneType getType(){ return planeType; }

    public int getCapacityFromEnum(){ return this.planeType.getCapacity();}

    public int getWeightFromEnum(){ return this.planeType.getWeight();}








}
