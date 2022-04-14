package net.mmiroshnichenko.basepatterns.structural.facade;

public class VehicleRunner {
    public static void main(String[] args) {
        VehicleFacade vehicleFacade = new VehicleFacade();

        vehicleFacade.speedUp();
    }
}
