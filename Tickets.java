public abstract class Tickets {
    //Attributes
    private String pnr;
    private String departureTime;
    private String arrivalTime;
    private String duration;
    private int seatNo; 
    private boolean status;
    private int price;
    private boolean cancel;

public Tickets(){

}
    public Tickets(String pnr,String departureTime,String arrivalTime,String duration,int seatNo,boolean status,int price,boolean cancel)
    {
        this.pnr=pnr;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
        this.duration=duration;
        this.seatNo=seatNo;
        this.status=status;
        this.price=price;
        this.cancel=cancel;
    }
    //Getter for pnr
    String pnr() {
        return pnr;
    }
    // Setter for flight
    void setpnr(String pnr) {
        this.pnr = pnr;
    }
    //Getter for departureTime
    String departureTime() {
        return departureTime;
    }
    // Setter for departureTime
    void setdepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
     //Getter for arrivalTime
     String arrivalTime() {
        return arrivalTime;
    }
    // Setter for departureTime
    void setarrivalTime(String string) {
        this.arrivalTime = arrivalTime;
    }
     //Getter for duration
     String duration() {
        return duration;
    }
    // Setter for duration
    void setduration(String duration) {
        this.duration = duration;
    }
     //Getter for seatNo
     int seatNo() {
        return seatNo;
    }
    // Setter for seatNo
    void setseatNo(int seatNo) {
        this.seatNo = seatNo;
    } 
    //Getter for seatNo
    boolean status() {
       return status;
   }
   // Setter for seatNo
   void setstatus(boolean status) {
       this.status = status;
   }
     //Getter for price
     int price() {
        return price;
    }
    // Setter for price
    void setprice(int price) {
        this.price = price;
    } 
    //Getter for seatNo
    boolean cancel() {
        return cancel;
    }
    // Setter for seatNo
    void setcancel(boolean cancel) {
        this.cancel = cancel;
    }
}

