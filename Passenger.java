import java.util.Scanner;

public class Passenger {
  Scanner sc = new Scanner (System.in);
  String name = sc.nextLine();
  int age = sc.nextInt();

    public Passenger() {
    }

    public Passenger(String name, int age) {
      this.name = name;
      this.age = age;
   
    }
    
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
    
    public int getAge() {
      if (age >= 18 && age <= 55) {
        System.out.println("You are an Adult. Please Continue");
        
      } else if (age > 55) {
        System.out.println("You are an Senior. Please Continue");
        
      } else {
        System.out.println("You are a child. Please call Airlines for more Assitance.");
        System.exit(0);
      }
      return age;
    }
  
    public void setAge(int age) {
      this.age = age;
      
      
    }

   
  public String toString() {
        return "Hello, " + getName() + ". Your are " + getAge()+ " years old.";
  }
}