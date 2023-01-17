package Transport;

public class Bus extends Transport implements Racing{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public void getPitStop(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() + " - съехал с дистанции на питстоп!");
    }
    public void getBestTimeLap(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() + " - Лучшее время круга!");
    }
    public void getMaxSpeed(Bus bus) {
        System.out.println(bus.getBrand() + " " + bus.getModel() + " - Набрал максимальную скорость!");

    }

}
