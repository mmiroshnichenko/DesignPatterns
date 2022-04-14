package net.mmiroshnichenko.basepatterns.structural.facade;

public class VehicleFacade {
    private Engine engine = new Engine();
    private FuelPump fuelPump = new FuelPump();
    private Injector injector = new Injector();

    public void speedUp() {
        fuelPump.setConsumption(100);
        injector.setFuelSupply(fuelPump.getConsumption());
        engine.up(injector.getFuelSupply() * 10);
    }
}
