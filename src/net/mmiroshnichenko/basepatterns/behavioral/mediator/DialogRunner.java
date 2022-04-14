package net.mmiroshnichenko.basepatterns.behavioral.mediator;

public class DialogRunner {
    public static void main(String[] args) {
        AuthenticationDialog authDialog = new AuthenticationDialog();

        Button button = new Button(authDialog);
        Textbox textbox = new Textbox(authDialog);
        Checkbox checkbox = new Checkbox(authDialog);

        button.click();
        textbox.keypress();
        checkbox.check();
    }
}
