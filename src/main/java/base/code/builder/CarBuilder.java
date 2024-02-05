package base.code.builder;

import base.code.model.Engine;
import base.code.model.Car;

public class CarBuilder implements Builder {
  private Car car = new Car();

  @Override
  public void reset() {
    car = new Car();
  }

  @Override
  public void setSeats(int number) {
    car.setSeats(number);
  }

  @Override
  public void setEngine(Engine engine) {
    car.setEngine(engine);
  }

  @Override
  public void setGPS() {
    car.setGps("gps");
  }

  @Override
  public void setTripComputer() {
    car.setTripComputer("Trip Computer");
  }

  public Car getResult() {
    return car;
  }
}
