package net.mmiroshnichenko.basepatterns.structural.adapter;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new AdapterTrainToVehicle();
        vehicle.run();
        vehicle.stop();
    }
}
