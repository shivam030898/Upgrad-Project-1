public class Flight extends Tickets {
    //Attributes
    private int flightNumber;
    private  String airlineName;
    private  int capacity; //Total Seat on the Flight is 100
    private  int seatBooked;
    private  int seatAvaliable;

    //constructor
    Flight(){

    }

    //Parametrized Constructor
    Flight(int flightNumber,String airlineName,int capacity,int seatBooked,int 
    seatAvaliable,String pnr,String departureTime,String arrivalTime,String duration,int seatNo,
    boolean status,int price,boolean cancel){
        this.capacity=100;
        super.setpnr(pnr);
        super.setdepartureTime(departureTime);
        super.setarrivalTime(arrivalTime);
        super.setduration(duration);
        super.setseatNo(seatNo);
        super.setstatus(status);
        super.setprice(price);
        super.setcancel(cancel);
    }  
    //Getter for flightNumber
    int flightNumber() {
        return flightNumber;
    }
    // Setter for flight
    void setflightNumber(String string) {
        this.flightNumber = flightNumber;
    }
    //Getter for airlineName
    String airlineName() {
        return airlineName;
    }
    // Setter for airlineName
    void setairlineName(String airlineName) {
        this.airlineName = airlineName;
    }
     //Getter for capacity
     int capacity() {
        return capacity;
    }
    // Setter for capacity
    void capacity(int capacity) {
        this.capacity = capacity;
    }
      //Getter for seatBooked
      int seatBooked() {
        return seatBooked;
    }
    // Setter for seatBooked
    void seatBooked(int seatBooked) {
        this.seatBooked = seatBooked;
    }
      //Getter for seatAvaliable
      int seatAvaliable() {
        return seatAvaliable;
    }
    // Setter for seatAvaliable
    void seatAvaliable(int seatAvaliable) {
        this.seatAvaliable = seatAvaliable;
    }
    //Method
    public void updateSeatAvaliable(){
         this.capacity--;
    }
    public String updateDetails(){
        return "Flight Number; "+ this.flightNumber()+ "airline Name: "+ this.airlineName()+"Capacity: "+this.capacity()+"Seat Avaliable; "+capacity(); 
    }
}
