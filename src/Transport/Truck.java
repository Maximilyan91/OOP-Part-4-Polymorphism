package Transport;

public class Truck extends Transport {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
