package Transport;

import Drivers.DriverB;

public class Car extends Transport<DriverB> implements Racing {
    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }
    public void getPitStop(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " - съехал с дистанции на питстоп!");
    }
    public void getBestTimeLap(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " - Лучшее время круга!");
    }
    public void getMaxSpeed(Car car) {
        System.out.println(car.getBrand() + " " + car.getModel() + " - Набрал максимальную скорость!");

    }

}

