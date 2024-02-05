package base.code;

import base.code.builder.Builder;
import base.code.model.Engine;

public class Director {
  public void makeSUV(Builder builder){
    builder.setEngine(new Engine("SUV"));
  };
  public void makeSportsCar(Builder builder){
    builder.setEngine(new Engine("SportsCar"));
  };
}
