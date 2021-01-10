import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight1;
    Plane plane1;
    Plane plane2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void setUp() {
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.AIRBUSA380);
        flight1 = new Flight(001, plane1, "MUC", "LHR",
                "0900" );
        passenger1 = new Passenger("D.Craig", 1);
        passenger2 = new Passenger("S.Connery", 2);
        passenger3 = new Passenger("J.Moneypenny", 2);
        passenger4 = new Passenger("M", 2);
}
    @Test
    public void hasFlightNo(){ assertEquals(001, flight1.getFlightNo());}

    @Test
    public void flightHasPlane(){ assertEquals(PlaneType.BOEING747, flight1.getPlaneType());}

    @Test
    public void returnTotalSeats(){assertEquals(3, flight1.totalSeats());}

    @Test
    public void passengerListSize(){assertEquals(0, flight1.listSize());}

    @Test
    public void addPassenger_underCapacity(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(2, flight1.listSize());}

    @Test
    public void addPassenger_atCapacity(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        assertEquals(3, flight1.listSize());}

    @Test
    public void addPassenger_overCapacity(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        flight1.addPassenger(passenger4);
        assertEquals(3, flight1.listSize());}

    @Test
    public void availableSeats_1(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(1, flight1.availableSeats());
    }

    @Test
    public void availableSeats_0(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        assertEquals(0, flight1.availableSeats());
    }

    @Test
    public void availableSeats_addOverCapacity(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        flight1.addPassenger(passenger4);
        assertEquals(0, flight1.availableSeats());
    }

}
