import java.util.*;

class Main {
  public static void main(String[] args) {

    System.out.println("This is for individual airline reservations only.");
    System.out.println("Only Adults and Seniors can continue on.");
    System.out.println(
        "What is your name? (First and Last name and click enter please) How old are? Input your address (click enter) your city (click enter) your State and phone number");
    Personel p = new Personel();
    System.out.println(p.toString());

    System.out.println("Thank you for your personal info. Now its time to continue your reservation.");

    System.out.println("Input Airline Name: EX: American Airlines");
    System.out.println(" Input Airport's City (Click Enter) and Airport's Country EX:Tampa, USA");
    Airline ar = new Airline();
    Airport ap = new Airport();

    System.out.println("Your input is: " + ar.toString() + " and " + ap.toString());

    System.out.println(
        "Input the time you want to leave with am or pm (Click Enter) the airport's abbreviation that you are departing from (Click Enter) the arrival airport's abbreviation (Click Enter) the Month/day/year arrival date (Click Enter) and the time you want to arrive with am or pm");
    Flight f = new Flight();
    f.getDepartureTime();
    f.getDepartureDate();
    f.getDepartureAirport();
    f.getArrivalTime();
    f.getDestinationAirport();
    f.getFlightNumber();

    System.out.println(f.toString());
    System.out.println(" To complete the reservation, please complete seating arrangements. Thanks.");

    Seat s = new Seat();
    Reservation r = new Reservation();
    r.getReservationNumber();
    System.out.println("Reservation Information: ");
    System.out.println("Reservation Number: " + r);
    System.out.println("Name: " + p.getName());
    System.out.println("Flight Information: " + f.toString());
    System.out.println(s.toString());
  }
}
