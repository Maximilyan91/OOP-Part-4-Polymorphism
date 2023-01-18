package Transport;

import Drivers.DriverC;

public class Truck extends Transport<DriverC> implements Racing {

    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    public void getPitStop(Truck truck) {
        System.out.println(truck.getBrand() + " " + truck.getModel() + " - съехал с дистанции на питстоп!");
    }
    public void getBestTimeLap(Truck truck) {
        System.out.println(truck.getBrand() + " " + truck.getModel() + " - Лучшее время круга!");
    }
    public void getMaxSpeed(Truck truck) {
        System.out.println(truck.getBrand() + " " + truck.getModel() + " - Набрал максимальную скорость!");

    }
}
