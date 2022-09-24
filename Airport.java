import java.util.Scanner;
import java.util.Random;

public class Airport {
  Scanner sc = new Scanner(System.in);
    private String airportID; 
    private String city = sc.nextLine();
    private String country = sc.nextLine();
    

    public Airport() {
    
    }


    public Airport(String airportID, String city, String country) {
        
        this.setAirportID(airportID);
        this.setCity(city);
        this.setCountry(country);
    }

    
    public void setAirportID(String airportID) {             
        
        if(airportID.matches("[a-zA-Z]+$") && airportID.length()==3){
            this.airportID = airportID.toUpperCase();
        }
        else{
            System.out.println("Invalid Airport ID");
        }
          
    }

    public void setCity(String city) {
        if (city.matches("[a-zA-Z ]+$")) {
            this.city = city;
        }
        else{
            System.out.println("Invalid City Name");
        }
    }

    public void setCountry(String country) {
        if (country.matches("[a-zA-Z ]+$")) {
            this.country = country;
        }
        else{
            System.out.println("Invalid Airline Name");
        }
    }

    public String getAirportID() {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    StringBuilder sb = new StringBuilder();

    Random random = new Random();

    int length = 3;

    for(int i = 0; i < length; i++) {

      int index = random.nextInt(alphabet.length());

      char randomChar = alphabet.charAt(index);

      sb.append(randomChar);
    }

    
        airportID = sb.toString();
        return airportID; 
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return this.getAirportID()+ "," + this.getCity() + "," + this.getCountry();
    }
    
    
    
}