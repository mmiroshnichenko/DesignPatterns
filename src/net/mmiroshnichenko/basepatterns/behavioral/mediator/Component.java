package net.mmiroshnichenko.basepatterns.behavioral.mediator;

public abstract class Component {
    protected Mediator dialog;

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }

    public void click() {
        dialog.notifyMessage(this, "click");
    }

    public void keypress() {
        dialog.notifyMessage(this, "keypress");
    }
}
