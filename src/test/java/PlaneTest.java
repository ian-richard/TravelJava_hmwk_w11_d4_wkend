import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane1;
    Plane plane2;

    @Before
    public void setUp() {
        plane1 = new Plane(PlaneType.BOEING747 );
    }

    @Test
    public void hasType(){ assertEquals(PlaneType.BOEING747, plane1.getType());}

    @Test
    public void hasCapacity(){ assertEquals(3, plane1.getCapacityFromEnum());}

    @Test
    public void hasWeight(){ assertEquals(150, plane1.getWeightFromEnum());}
}

