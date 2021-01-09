import java.util.ArrayList;

public class Flight {
    private int flightNo;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(int flightNo, Plane plane, String destination, String departureAirport,
                  String departureTime){
        this.flightNo = flightNo;
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public int getFlightNo(){ return flightNo; }

    public Plane getPlaneType(){ return this.plane; }
}
