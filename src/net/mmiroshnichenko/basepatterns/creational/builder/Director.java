package net.mmiroshnichenko.basepatterns.creational.builder;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car buildCar() {
        builder.createCar();
        builder.buildType();
        builder.buildSeatPlaces();
        builder.buildPrice();

        Car car = builder.getCar();

        return car;
    }
}
