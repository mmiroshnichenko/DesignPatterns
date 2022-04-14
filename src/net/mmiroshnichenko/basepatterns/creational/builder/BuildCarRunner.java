package net.mmiroshnichenko.basepatterns.creational.builder;

public class BuildCarRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new FamilyCarBuilder());
        Car car = director.buildCar();

        System.out.println(car);
    }
}
