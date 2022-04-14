package net.mmiroshnichenko.basepatterns.behavioral.memento;

public class Snapshot {
    private final Editor editor;
    private final String text;
    private final int curX, curY, selectionWidth;

    public Snapshot(Editor editor, String text, int curX, int curY, int selectionWidth) {
        this.editor = editor;
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.selectionWidth = selectionWidth;
    }

    public void restore() {
        editor.setText(text);
        editor.setCursor(curX, curY);
        editor.setSelectionWidth(selectionWidth);
    }
}
