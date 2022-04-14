package net.mmiroshnichenko.basepatterns.behavioral.command;

public class EditorRunner {
    public static void main(String[] args) {
        Point point = new Point();

        Editor editor = new Editor(
                new UpCommand(point),
                new DownCommand(point),
                new LeftCommand(point),
                new RightCommand(point)
        );

        editor.moveUpPoint();
        editor.moveDownPoint();
        editor.moveLeftPoint();
        editor.moveRightPoint();
    }
}
