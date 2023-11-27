package Structural_Pattern.DecoratorPattern;
//Tạo Decorator
public abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public Car manufactureCar() {
        return car.manufactureCar();
    }

    @Override
    public String getCarDetails() {
        return car.getCarDetails();
    }
}
