package builders;

import сomponentss.BodyType;
import сomponentss.Engine;
import сomponentss.Transmission;

public interface Builder {
    CarBuilder setEngine(Engine engine);
    CarBuilder setTransmission(Transmission transmission);
    CarBuilder setBodyType(BodyType bodyType);
}
