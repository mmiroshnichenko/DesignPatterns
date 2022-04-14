package net.mmiroshnichenko.basepatterns.behavioral.mediator;

public class Checkbox extends Component {
    public Checkbox(Mediator dialog) {
        super(dialog);
    }

    public void check() {
        dialog.notifyMessage(this, "check");
    }
}
