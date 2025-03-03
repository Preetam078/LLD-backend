package builder_pattern.builders;

import builder_pattern.cars.CarType;
import builder_pattern.components.Engine;
import builder_pattern.components.GPSNavigator;
import builder_pattern.components.Transmission;
import builder_pattern.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
