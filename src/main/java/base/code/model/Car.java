package base.code.model;

public class Car {
  private int seats;
  private Engine engine;
  private String tripComputer;
  private String gps;

  public int getSeats() {
    return seats;
  }

  public Engine getEngine() {
    return engine;
  }

  public String getTripComputer() {
    return tripComputer;
  }

  public String getGps() {
    return gps;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public void setTripComputer(String tripComputer) {
    this.tripComputer = tripComputer;
  }

  public void setGps(String gps) {
    this.gps = gps;
  }

  @Override
  public String toString() {
    return "Car{" +
            "seats=" + seats +
            ", engine=" + engine +
            ", tripComputer='" + tripComputer + '\'' +
            ", gps='" + gps + '\'' +
            '}';
  }
}