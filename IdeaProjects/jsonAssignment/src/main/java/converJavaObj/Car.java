package converJavaObj;

public class Car {
    private String carName;
    private String carModel;
    private String brand;

    public Car(String carName, String carModel, String brand) {
        this.carName = carName;
        this.carModel = carModel;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarName() {
        return carName;
    }
}
