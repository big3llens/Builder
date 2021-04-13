package сomponentss;

public class Car {
    private Engine engine;
    private Transmission transmission;
    private BodyType bodyType;

    public Car(Engine engine, Transmission transmission, BodyType bodyType) {
        this.engine = engine;
        this.transmission = transmission;
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", transmission=" + transmission +
                ", bodyType=" + bodyType +
                '}';
    }
}
