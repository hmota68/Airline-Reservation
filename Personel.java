import java.util.Scanner;

public class Personel extends Passenger  implements Address{
  
  Scanner sc = new Scanner(System.in);


  @Override  
  public String address() {
    String address = sc.nextLine();  
    return address;
  }

  @Override
  public String city() {
    String city = sc.nextLine();
    return city;
  }

  @Override
  public String state() {
    String state = sc.nextLine();
    return state;
  }

  @Override
  public String telephoneNumber() {
    String telephoneNumber = sc.nextLine();
    return telephoneNumber;
  }


  @Override
  public String toString() {
    return "Hello " + name + ". You are " + age + " years old. " + getAge() + " Your address is: " + this.address() + "," + this.city() + "," + this.state() + ". Your phone number is: " + this.telephoneNumber();
  }
}