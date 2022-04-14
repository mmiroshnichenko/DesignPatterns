package net.mmiroshnichenko.basepatterns.structural.facade;

public class Injector {
    private int fuelSupply = 0;

    public int getFuelSupply() {
        return fuelSupply;
    }

    public void setFuelSupply(int fuelSupply) {
        this.fuelSupply = fuelSupply;
    }
}
