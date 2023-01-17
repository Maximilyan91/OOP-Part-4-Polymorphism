import Transport.Bus;
import Transport.Car;
import Transport.Transport;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Car brand 1", "model 1", 1.0);
        Car car2 = new Car("Car brand 2", "model 2", 2.0);
        Car car3 = new Car("Car brand 3", "model 3", 3.0);
        Car car4 = new Car("Car brand 4", "model 4", 4.0);

        Bus bus1 = new Bus("Bus brand 1", "Bus model 1", 1.0);
        Bus bus2 = new Bus("Bus brand 2", "Bus model 2", 2.0);
        Bus bus3 = new Bus("Bus brand 3", "Bus model 3", 3.0);
        Bus bus4 = new Bus("Bus brand 4", "Bus model 4", 4.0);

        Truck truck1 = new Truck("Truck brand 1", "Truck model 1", 1.0);
        Truck truck2 = new Truck("Truck brand 2", "Truck model 2", 2.0);
        Truck truck3 = new Truck("Truck brand 3", "Truck model 3", 3.0);
        Truck truck4 = new Truck("Truck brand 4", "Truck model 4", 4.0);

        car2.getPitStop(car2);
        bus1.getBestTimeLap(bus1);
        truck3.getMaxSpeed(truck3);

        Driver<Transport> carDriver = new Driver<>("CarDriver", "B", 10);
    }

}