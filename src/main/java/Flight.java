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

    public PlaneType getPlaneType(){ return this.plane.getType(); }

    public int totalSeats(){ return this.plane.getCapacityFromEnum();}
    
    public int listSize(){ return this.passengers.size();}

    public void addPassenger(Passenger passenger){
        if (this.listSize() < this.totalSeats()) {
            this.passengers.add(passenger);
        }
    }

    public int availableSeats() {
        int availableSeatNo;
        int totalSeatsNo;
        int result;
        totalSeatsNo = this.totalSeats();
        availableSeatNo = this.listSize();
        result = totalSeatsNo - availableSeatNo;
        return result;
    }

}
