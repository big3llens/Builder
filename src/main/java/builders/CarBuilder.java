package builders;

import сomponentss.BodyType;
import сomponentss.Car;
import сomponentss.Engine;
import сomponentss.Transmission;

public class CarBuilder implements Builder{
    private Engine engine;
    private Transmission transmission;
    private BodyType bodyType;

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    public Car build (){
        return new Car (engine, transmission, bodyType);
    }
}
