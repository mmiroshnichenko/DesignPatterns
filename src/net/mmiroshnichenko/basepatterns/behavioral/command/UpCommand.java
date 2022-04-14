package net.mmiroshnichenko.basepatterns.behavioral.command;

public class UpCommand implements Command {
    private Point point;

    public UpCommand(Point point) {
        this.point = point;
    }

    @Override
    public void execute() {
        point.up();
    }
}
