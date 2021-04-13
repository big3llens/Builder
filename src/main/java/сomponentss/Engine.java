package сomponentss;

public class Engine {
    private int numberOfCylinders;
    private EnginesType enginesType;

    public Engine(int numberOfCylinders, EnginesType enginesType) {
        this.numberOfCylinders = numberOfCylinders;
        this.enginesType = enginesType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "numberOfCylinders=" + numberOfCylinders +
                ", enginesType=" + enginesType +
                '}';
    }
}
