package Transport;

public class Car extends Transport{
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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

