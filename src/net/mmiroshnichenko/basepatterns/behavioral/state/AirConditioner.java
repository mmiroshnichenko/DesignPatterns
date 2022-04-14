package net.mmiroshnichenko.basepatterns.behavioral.state;

public class AirConditioner {
    Mode mode;

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void changeMode() {
        if (mode instanceof  Cooling) {
            setMode(new Drying());
        } else if (mode instanceof Drying) {
            setMode(new Heating());
        } else if (mode instanceof Heating) {
            setMode(new Cooling());
        }
    }

    public void working() {
        mode.working();
    }
}
