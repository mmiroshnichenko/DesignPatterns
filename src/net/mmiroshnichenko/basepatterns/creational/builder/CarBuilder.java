package net.mmiroshnichenko.basepatterns.creational.builder;

public abstract class CarBuilder {
    protected Car car;

    public void createCar() {
        car = new Car();
    }

    abstract void buildType();
    abstract void buildSeatPlaces();
    abstract void buildPrice();

    public Car getCar() {
        return car;
    }
}
