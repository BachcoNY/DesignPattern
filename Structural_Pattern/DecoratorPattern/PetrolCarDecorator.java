package Structural_Pattern.DecoratorPattern;

public class PetrolCarDecorator extends CarDecorator {
    public PetrolCarDecorator(Car car) {
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
            bmwCar.setEngine("Petrol Engine");
            System.out.println("PetrolCarDecorator added Petrol Engine to the Car: " + car.getCarDetails());
        }
    }
}