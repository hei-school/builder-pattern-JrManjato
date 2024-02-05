package base.code;

import base.code.builder.CarBuilder;
import base.code.model.Car;

public class Main {
  public static void main(String[] args) {
    var director = new Director();
    var builder = new CarBuilder();
    builder.setSeats(5);
    builder.setGPS();
    director.makeSUV(builder);
    Car car = builder.getResult();
    System.out.println(car);
  }
}