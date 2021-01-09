import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PassengerTest {
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setUp() {
        passenger1 = new Passenger("D.Craig", 1);
        passenger2 = new Passenger("S.Connery", 2);
    }

    @Test
    public void hasName() {
        assertEquals("D.Craig", passenger1.getName());
    }

    @Test public void hasBags() {
        assertEquals(1, passenger1.getBags());
    }
}
