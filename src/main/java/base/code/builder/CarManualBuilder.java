package base.code.builder;

import base.code.model.Engine;
import base.code.model.CarManual;

public class CarManualBuilder implements Builder {
  private CarManual carManual = new CarManual();

  @Override
  public void reset() {
    carManual = new CarManual();
  }


  @Override
  public void setSeats(int number) {
    carManual.setSeats(number);
  }

  @Override
  public void setEngine(Engine engine) {
    carManual.setEngine(engine);
  }

  @Override
  public void setGPS() {
    carManual.setGps("gps");
  }

  @Override
  public void setTripComputer() {
    carManual.setTripComputer("Trip Computer");
  }


  public CarManual getResult() {
    return carManual;
  }
}
