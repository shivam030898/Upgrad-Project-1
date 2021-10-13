public class Source {
    public static void main(String[] args){
         System.out.println("--------Welcome to Airline Booking Portal--------");
         System.out.println("Register as Passenger For Booking the Flight");
         System.out.println(" =======Passengers Details======== ");

         Contact c1=new Contact();
         c1.setname("Shivam");
         c1.setemail("s.shivan7879@gmail.com");
         c1.setnumber("965175771");
         Address a1=new Address();
         a1.setaddress("Lucknow");
         System.out.println("Name: "+c1.name());
         System.out.println("Passenger Number: "+c1.number());
         System.out.println("Passenger Email: "+c1.email());
         System.out.println("Passenger Address: "+a1.address());
         System.out.println("Ticket Type: Regular Ticket");

         
         Passenger p1=new Passenger(a1,c1);
         regularTicket r1=new regularTicket();
         r1.setfood(false);
         r1.setwater(true);
         r1.setsnacks(false);
         System.out.println("Food: "+r1.food());
         System.out.println("Water: "+r1.water());
         System.out.println("Snacks: "+r1.snacks());
         System.out.println("Flight Details");
         Flight f1=new Flight();
         f1.setflightNumber("1001");
         f1.setairlineName("Air India");
         f1.capacity(100);
         f1.seatBooked(5);
         f1.setseatNo(1);
         f1.setpnr("S771");
         f1.setdepartureTime("2:00 PM IST");
         f1.setarrivalTime("10:00 PM IST");
         f1.setprice(10000);
         f1.setduration("4 HOURS");
         f1.updateSeatAvaliable();
         System.out.println("FLight Details");
         System.out.println("Flight Number: "+f1.flightNumber());
         System.out.println("Airline Name: "+f1.airlineName());
         System.out.println("Flight PNR: "+f1.pnr());
         System.out.println("Arrival Time: "+f1.arrivalTime());
         System.out.println("Departure Time: "+f1.departureTime());
         System.out.println("Price: "+f1.price());
         System.out.println("Duration: "+f1.duration());
         System.out.println("Capacity: "+f1.capacity());


         //PASSENGER 2
         System.out.println();
         System.out.println("2nd Passenger");
         Contact c2=new Contact();
         c1.setname("Shubham");
         c1.setemail("s.shubham7879@gmail.com");
         c1.setnumber("965175571");
         Address a2=new Address();
         a1.setaddress("Lucknow");
         System.out.println("Name: "+c1.name());
         System.out.println("Passenger Number: "+c1.number());
         System.out.println("Passenger Email: "+c1.email());
         System.out.println("Passenger Address: "+a1.address());
         System.out.println("Ticket Type: Tourist Ticket");

         Passenger p2=new Passenger(a2,c2);
         touristTicket r2=new touristTicket();
         r2.sethotelAddress("ITC GRAND CHOLA");
         r2.settouristLocation("Taj Mahal");
         r2.setstops(1);
         System.out.println("Hotel Address: "+r2.hotelAddress());
         System.out.println("Tourist Location: "+r2.touristLocation());
         System.out.println("Flight Details");
         Flight f2=new Flight();
         f2.setflightNumber("1002");
         f2.setairlineName("Air India");
         f2.capacity(100);
         f2.seatBooked(5);
         f2.setseatNo(1);
         f2.setpnr("R5002");
         f2.setdepartureTime("2:00 PM IST");
         f2.setarrivalTime("10:00 PM IST");
         f2.setprice(10000);
         f2.setduration("4 HOURS");
         f2.updateSeatAvaliable();
         System.out.println("FLight Details");
         System.out.println("Flight Number: "+f2.flightNumber());
         System.out.println("Airline Name: "+f2.airlineName());
         System.out.println("Flight PNR: "+f2.pnr());
         System.out.println("Arrival Time: "+f2.arrivalTime());
         System.out.println("Departure Time: "+f2.departureTime());
         System.out.println("Price: "+f2.price());
         System.out.println("Duration: "+f2.duration());
         System.out.println("Capacity: "+f2.capacity());



         
        
         
    }
}
