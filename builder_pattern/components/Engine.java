package builder_pattern.components;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean isStarted;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }
    public void on() {
        isStarted = true;
    }
    public void off() {
        isStarted = false;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public double getVolume() {
        return volume;
    }

    public double getmileage() {
        return mileage;
    }

    public void go(double mileage) {
        if (isStarted) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

}
