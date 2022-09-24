import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

  public class Seat {
    Scanner sc = new Scanner (System.in);
    ArrayList<ArrayList<Character>> seating = getSeatingChart();
    int userRow = 0;
    int userColumn = 0;

    public Seat() {
      System.out.println("Welcome to seat assignment. \n");
      System.out.print(createChart(seating));
      System.out.println("Please select a row (1-" + seating.size() + "): ");
      userRow = sc.nextInt();
      System.out.println("Please select a column ( 1-" + seating.get(0).size() + "): ");
      userColumn = sc.nextInt();

      if (seating.get(userRow-1).get(userColumn-1) == ' ') {
        System.out.println("Seat " + userRow + " , " + userColumn + " is now reserved. ");
        seating.get(userRow -1).set(userColumn-1, 'x');
      } else {
        System.out.println("Seat " + userRow + " , " + userColumn + "is already taken.");
      }
      System.out.print(createChart(seating));
      sc.close();
    }

    public static String createChart(ArrayList<ArrayList<Character>>chartInput) {
      String chart = "";
      for(int i = 1; i <= chartInput.get(0).size(); i++) {
        chart += " " + i;
      }
      chart += "\n";
      int count = 0;
      for (int i = 1; i <= chartInput.size(); i++) {
        chart += i;
        for (int j = 0; j < chartInput.get(0).size(); j++) {
          chart += "[" + chartInput.get(count).get(j) + "]";
        }
        chart += "\n";
        count++;
      }
      return chart;
    }

    public static ArrayList<ArrayList<Character>>getSeatingChart() {
      
      Random rand = new Random();
      int rows = rand.nextInt(10) +1;
      int columns = rand.nextInt(10) +1;

      ArrayList<ArrayList<Character>> seats = new ArrayList<>();
      for (int row = 0; row<rows; ++row) {
        ArrayList<Character> aRow = new ArrayList<>();
        for(int col=0; col<columns; ++col) {
          if(rand.nextBoolean()) {
            aRow.add('x');
          }else {
            aRow.add(' ');
          }
        }
        seats.add(aRow);
      }
      return seats;
    }
      @Override
    public String toString(){
        return "This is your assigned seat: " + userRow + "," + userColumn;
    }
  }