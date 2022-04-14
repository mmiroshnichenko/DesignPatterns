package net.mmiroshnichenko.basepatterns.structural.adapter;

public class AdapterTrainToVehicle extends Train implements Vehicle{
    @Override
    public void stop() {
        stopOnRails();
    }

    @Override
    public void run() {
        runOnRails();
    }
}
