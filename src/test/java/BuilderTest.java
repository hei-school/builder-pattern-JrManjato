import base.code.Director;
import base.code.builder.CarBuilder;
import base.code.builder.CarManualBuilder;
import base.code.model.Car;
import base.code.model.CarManual;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BuilderTest {
  private final Director director = new Director();

  @Test
  public void create_car_ok(){
    var carBuilder = new CarBuilder();

    carBuilder.setSeats(5);
    carBuilder.setGPS();
    director.makeSUV(carBuilder);
    Car actual = carBuilder.getResult();

    assertEquals(5, actual.getSeats());
    assertEquals("gps", actual.getGps());
    assertEquals("SUV", actual.getEngine().getName());
  }

  @Test
  public void create_car_manual_ok(){
    var carManualBuilder = new CarManualBuilder();

    carManualBuilder.setSeats(5);
    director.makeSportsCar(carManualBuilder);
    CarManual actual = carManualBuilder.getResult();

    assertEquals(5, actual.getSeats());
    assertNull(actual.getGps());
    assertEquals("SportsCar", actual.getEngine().getName());
  }
}
