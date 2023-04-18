import java.util.Arrays;

public class Airline {
    private String destination;
    private int flightNumber;
    private String planeType;
    private String departureTime;
    private String[] daysOfWeek;

    public Airline(String destination, int flightNumber, String planeType, String departureTime, String[] daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public static void main(String[] args) {
        Airline[] flights = {
                new Airline("London", 123, "Boeing 737", "10:00", new String[]{"Monday", "Wednesday", "Friday"}),
                new Airline("New York", 456, "Airbus A320", "14:30", new String[]{"Tuesday", "Thursday", "Saturday"}),
                new Airline("Paris", 789, "Boeing 747", "18:45", new String[]{"Monday", "Wednesday", "Friday", "Sunday"}),
                new Airline("Tokyo", 101, "Boeing 777", "22:15", new String[]{"Tuesday", "Saturday"}),
        };

        System.out.println("List of flights:");
        for (Airline flight : flights) {
            System.out.println("Destination: " + flight.getDestination());
            System.out.println("Flight number: " + flight.getFlightNumber());
            System.out.println("Plane type: " + flight.getPlaneType());
            System.out.println("Departure time: " + flight.getDepartureTime());
            System.out.println("Days of week: " + Arrays.toString(flight.getDaysOfWeek()));
            System.out.println();
        }
    }
}