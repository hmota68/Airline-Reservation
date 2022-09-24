import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Random;


public class Flight {

    Scanner sc = new Scanner(System.in);
    private String flightNumber;
    private String departureDate = sc.nextLine();
    private String departureAirport = sc.nextLine();
    private String destinationAirport = sc.nextLine();
    private String departureTime = sc.nextLine();
    private String arrivalTime = sc.nextLine();
  
  
    public Flight() {
    }
    
    
    public Flight(String flightNumber, int day, int month, int year, String departureAirport, String destinationAirport, String departureTime, String arrivalTime) {
        String airlineID = flightNumber.substring(0,2);
        String number = flightNumber.substring(2);
        this.setFlightNumber(airlineID, number);        
        setDepartureDate(day, month, year);
        this.departureAirport = departureAirport.toUpperCase();
        this.destinationAirport = destinationAirport.toUpperCase();
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
       
    }

    
    public void setFlightNumber(String airlineID, String number) {        
        if(airlineID.matches("[a-zA-Z]+$") && airlineID.length()==2 && number.matches("[0-9 ]+$")){
            this.flightNumber = airlineID + number;
            
        }
        else{
            System.out.println("Invalid Flight Number");
        }        
        
    }
    
    public void setDepartureDate(int day, int month, int year) {             
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");     
        Calendar calendar1 = new GregorianCalendar(year, month-1, day);     
        this.departureDate = sdf.format(calendar1.getTime());
    }    

    public void setDepartureAirport(String departureAirport) {
        
        if(departureAirport.matches("[a-zA-Z]+$") && departureAirport.length()==3) {
            this.departureAirport = departureAirport.toUpperCase();
        }
        else{
            System.out.println("Invalid Airport ID");
        }
        
    }  

    public void setDestinationAirport(String destinationAirport) {
       
       if(destinationAirport.matches("[a-zA-Z]+$") && destinationAirport.length()==3) {
            this.destinationAirport = destinationAirport.toUpperCase();
        }
        else{
            System.out.println("Invalid Airport ID");
        } 
        
        
    }  

    public void setDepartureTime(int hour, int minute) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm ");   
        Calendar calendar1 = new GregorianCalendar(2016, 12, 5, hour, minute);  
        this.departureTime = sdf.format(calendar1.getTime());
        
    }  

    public void setArrivalTime(int hour, int minute) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm ");    
        Calendar calendar1 = new GregorianCalendar(2016, 12, 5, hour, minute);   
        this.arrivalTime = sdf.format(calendar1.getTime());
    }  

    public String getFlightNumber() {
      String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String numbers = "0123456789";

      String alphaNumeric = upperAlphabet + numbers;

      StringBuilder sb = new StringBuilder();

      Random random = new Random();

      int length = 6;

      for(int i = 0; i < length; i++) {

      int index = random.nextInt(alphaNumeric.length());

      char randomChar = alphaNumeric.charAt(index);

      sb.append(randomChar);
    }

    flightNumber = sb.toString();
    return flightNumber;
    }
    
    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

     public String getDepartureTime() {
        return departureTime;
    }
    
      public String getArrivalTime() {
        return arrivalTime;
    }
        
    
    @Override
    public String toString() {
        return "Your flight info is: You are leaving on " + this.getDepartureTime() + ", at " + this.getDepartureDate() + ", from " + this.getDepartureAirport() + ", arriving at " + this.getArrivalTime() + ", in " + this.getDestinationAirport() + ". With your Flight Number being: " + flightNumber;
    }
}