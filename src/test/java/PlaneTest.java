import org.junit.Before;

public class PlaneTest {
    Plane plane1;
    Plane plane2;

    @Before
    public void setUp() {
        plane1 = new Plane(001, PlaneType.BOEING747 );
    }
}
