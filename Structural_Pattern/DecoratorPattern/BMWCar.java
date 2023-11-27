package Structural_Pattern.DecoratorPattern;
//Tạo ConcreteComponent
public class BMWCar implements Car {
    private String carName = "BMW";
    private String carBody;
    private String carDoor;
    private String carWheels;
    private String carGlass;
    private String engine;

    @Override
    public Car manufactureCar() {
        carBody = "carbon fiber material";
        carDoor = "4 car doors";
        carWheels = "6 car glasses";
        carGlass = "4 MRF wheels";
        return this;
    }

    @Override
    public String getCarDetails() {
        return "BMWCar [CarName=" + carName + ", CarBody=" + carBody + ", CarDoor=" + carDoor + ", CarWheels="
                + carWheels + ", CarGlass=" + carGlass + ", Engine=" + engine + "]";
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}