public class FlightClass {
    private String origin;
    private String date;
    private String destination;
    private String  departureTime;
    private String arrivalTime;
    private String flightNumber;
    private double economicClassPrice;
    private double businessClassPrice;

    public FlightClass(){

    }

    public FlightClass(String origin, String date, String destination, String departureTime, String arrivalTime, String flightNumber, double economicClassPrice, double businessClassPrice) {
        this.origin = origin;
        this.date = date;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightNumber = flightNumber;
        this.economicClassPrice = economicClassPrice;
        this.businessClassPrice = businessClassPrice;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public double getEconomicClassPrice() {
        return economicClassPrice;
    }

    public void setEconomicClassPrice(double economicClassPrice) {
        this.economicClassPrice = economicClassPrice;
    }

    public double getBusinessClassPrice() {
        return businessClassPrice;
    }

    public void setBusinessClassPrice(double businessClassPrice) {
        this.businessClassPrice = businessClassPrice;
    }

    @Override
    public String toString() {
        return "FlightClass{" +
                "origin='" + origin + '\'' +
                ", date='" + date + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", economicClassPrice=" + economicClassPrice +
                ", businessClassPrice=" + businessClassPrice +
                '}';
    }
}
