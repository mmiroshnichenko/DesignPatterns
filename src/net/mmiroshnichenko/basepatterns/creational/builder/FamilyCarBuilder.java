package net.mmiroshnichenko.basepatterns.creational.builder;

public class FamilyCarBuilder extends CarBuilder{
    @Override
    void buildType() {
        car.setType(Type.FAMILY);
    }

    @Override
    void buildSeatPlaces() {
        car.setSeatPlaces(7);
    }

    @Override
    void buildPrice() {
        car.setPrice(15000);
    }
}
