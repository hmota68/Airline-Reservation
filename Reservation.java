import java.util.Random;

public class Reservation {
    private String reservationNumber;
   
    public Reservation(){
    }
     public Reservation(String reservationNumber) {
        this.reservationNumber = reservationNumber;
       
    }

    public void setReservationNumber(String reservationNumber) {
      this.reservationNumber = reservationNumber;
    }  
    
    public String getReservationNumber() {
      String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String numbers = "0123456789";
      String alphaNumeric = upperAlphabet + numbers;
      StringBuilder sb = new StringBuilder();
      Random random = new Random();
      int length = 12;
      for(int i = 0; i < length; i++) {
      int index = random.nextInt(alphaNumeric.length());
      char randomChar = alphaNumeric.charAt(index);
      sb.append(randomChar);
      }
      reservationNumber = sb.toString();
        return reservationNumber;
    }
  }
