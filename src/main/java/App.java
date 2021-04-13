import builders.CarBuilder;
import сomponentss.*;

public class App {
    public static void main(String[] args) {
        CarBuilder cb = new CarBuilder();
        Car car = cb.setEngine(new Engine(4, EnginesType.PETROL)).setTransmission(new Transmission()).setBodyType(BodyType.HATCHBACK).build();
    }
}
