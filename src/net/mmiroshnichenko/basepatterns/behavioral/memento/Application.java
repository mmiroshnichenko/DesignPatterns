package net.mmiroshnichenko.basepatterns.behavioral.memento;

public class Application {
    private Snapshot backup;

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setCursor(10, 20);
        editor.setText("First text");
        editor.setSelectionWidth(35);

        System.out.println(editor);
        Snapshot snapshot = editor.createSnapshot();

        editor.setCursor(30, 25);
        editor.setText("Second text");
        editor.setSelectionWidth(45);

        System.out.println(editor);

        snapshot.restore();

        System.out.println(editor);


    }
}
