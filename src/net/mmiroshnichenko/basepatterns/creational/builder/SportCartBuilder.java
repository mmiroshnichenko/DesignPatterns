package net.mmiroshnichenko.basepatterns.creational.builder;

public class SportCartBuilder extends CarBuilder{
    @Override
    void buildType() {
        car.setType(Type.SPORT);
    }

    @Override
    void buildSeatPlaces() {
        car.setSeatPlaces(2);
    }

    @Override
    void buildPrice() {
        car.setPrice(50000);
    }
}
