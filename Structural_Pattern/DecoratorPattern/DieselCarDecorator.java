package Structural_Pattern.DecoratorPattern;
//Tạo ConcreteDecorator|

public class DieselCarDecorator extends CarDecorator {
    public DieselCarDecorator(Car car) {
        super(car);
    }

    @Override
    public Car manufactureCar() {
        car.manufactureCar();
        addEngine(car);
        return car;
    }

    public void addEngine(Car car) {
        if (car instanceof BMWCar) {
            BMWCar bmwCar = (BMWCar) car;
            bmwCar.setEngine("Diesel Engine");
            System.out.println("DieselCarDecorator added Diesel Engine to the Car: " + car.getCarDetails());
        }
    }
}