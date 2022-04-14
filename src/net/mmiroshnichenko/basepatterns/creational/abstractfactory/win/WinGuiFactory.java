package net.mmiroshnichenko.basepatterns.creational.abstractfactory.win;

import net.mmiroshnichenko.basepatterns.creational.abstractfactory.Button;
import net.mmiroshnichenko.basepatterns.creational.abstractfactory.CheckBox;
import net.mmiroshnichenko.basepatterns.creational.abstractfactory.GUIFactory;

public class WinGuiFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
