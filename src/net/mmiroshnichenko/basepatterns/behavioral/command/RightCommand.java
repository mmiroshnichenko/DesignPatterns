package net.mmiroshnichenko.basepatterns.behavioral.command;

public class RightCommand implements Command {
    private Point point;

    public RightCommand(Point point) {
        this.point = point;
    }

    @Override
    public void execute() {
        point.right();
    }
}
