import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight1;
    Plane plane1;
    Plane plane2;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setUp() {
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.AIRBUSA380);
        flight1 = new Flight(001, plane1, "MUC", "LHR",
                "0900" );
        passenger1 = new Passenger("D.Craig", 1);
        passenger2 = new Passenger("S.Connery", 2);
}
    @Test
    public void hasFlightNo(){ assertEquals(001, flight1.getFlightNo());}

    @Test
    public void flightHasPlane(){ assertEquals(Plane., flight1.getPlaneType());}


//    @Test
//    public void hasFlightNo(){ assertEquals(001, flight1.getFlightNo());}
}
