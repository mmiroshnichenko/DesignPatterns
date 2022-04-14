package net.mmiroshnichenko.basepatterns.behavioral.command;

public class Editor {
    Command up;
    Command down;
    Command left;
    Command right;

    public Editor(Command up, Command down, Command left, Command right) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    public void moveUpPoint() {
        up.execute();
    }

    public void moveDownPoint() {
        down.execute();
    }

    public void moveLeftPoint() {
        left.execute();
    }

    public void moveRightPoint() {
        right.execute();
    }
}
