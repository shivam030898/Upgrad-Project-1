public class touristTicket extends Tickets {
    //Attribute
    private String hotelAddress;
    private String touristLocation;
    private int stops;

    //Getter for Hotel Address
    String hotelAddress() {
        return hotelAddress;
    }
    // Setter for Hotel Address
    void sethotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
}
    //Getter for Tourist Location
    String touristLocation() {
        return touristLocation;
    }
    // Setter for seatNo
    void settouristLocation(String touristLocation) {
        this.touristLocation = touristLocation;
}
    //Getter for seatNo
    int stops() {
        return stops;
    }
    // Setter for seatNo
    void setstops(int stops) {
        this.stops = stops;
}
}
