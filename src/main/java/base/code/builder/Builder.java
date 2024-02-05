package base.code.builder;

import base.code.model.Engine;

public interface Builder {
  void reset();
  void setSeats(int number);
  void setEngine(Engine engine);
  void setGPS();
  void setTripComputer();
}
