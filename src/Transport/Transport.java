package Transport;

import java.time.LocalDate;

public class Transport {

    private final String brand;
    private final String model;
    private double engineVolume;
    private final String DEFAULT_VALUE = "default";
    private final double DEFAULT_ENGINE_VOLUME = 0.1;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = brand;
        }
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
        if (Double.compare(this.engineVolume,0)==0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        }

    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    protected void startDriving() {
        System.out.println("Начинаю ехать");
    }

    protected void stopDriving() {
        System.out.println("Прекращаю ехать");
    }

}

