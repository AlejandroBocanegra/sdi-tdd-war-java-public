import java.util.ArrayList;

public class Car{
  int mpg;
  int gallons;
  int odometer;
  ArrayList<String> trips = new ArrayList<String>();

  //Constructor for Car
  public Car(int mpg){
    this.mpg = mpg;
    this.gallons = 0;
    this.odometer = 0;
  }

  public void fill(int gas){
    this.gallons += gas;
  }

  public void drive(int miles){
    this.gallons -= miles / this.mpg;
    this.odometer += miles;
    this.trips.add(miles + " miles");
  }

}
