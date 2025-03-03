package builder_pattern;

import builder_pattern.builders.CarBuilder;
import builder_pattern.builders.CarManualBuilder;
import builder_pattern.cars.Car;
import builder_pattern.cars.Manual;
import builder_pattern.director.Director;

public class MainDemo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car sportsCar = builder.getResult();
        System.out.println("Car built:\n" + sportsCar.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
