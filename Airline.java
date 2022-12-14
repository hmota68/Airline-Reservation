import java.util.Scanner;
import java.util.Random;

public class Airline {

    Scanner sc = new Scanner(System.in);
    private String airlineName = sc.nextLine();    
    private String airlineID;
    
    public Airline() { 
    }

    public Airline(String airlineID, String name) {
        this.setAirlineID(airlineID);
        this.setAirlineName(name);
        
    }
    
    public void setAirlineID(String airlineID) {
       if(airlineID.matches("[a-zA-Z]+$") && airlineID.length()==2){
            this.airlineID = airlineID.toUpperCase();
        }
        else{
            System.out.println("Invalid Airline ID");
        }
        
    }
  
    public void setAirlineName(String airlineName) {
      if (airlineName.matches("[a-zA-Z ]+$")) {
            this.airlineName = airlineName;
        }
        else{
            System.out.println("Invalid Airline Name");
        }
        
    }

    public String getAirlineID() {
    
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    StringBuilder sb = new StringBuilder();

    Random random = new Random();

    int length = 2;

    for(int i = 0; i < length; i++) {

      int index = random.nextInt(alphabet.length());

      char randomChar = alphabet.charAt(index);

      sb.append(randomChar);
    }

    
       airlineID = sb.toString();
       return airlineID;
    }


    public String getAirlineName() {
        return airlineName;
    }
    
    @Override
    public String toString() {
        return this.getAirlineID()+ "," + this.getAirlineName();
    }
    
}