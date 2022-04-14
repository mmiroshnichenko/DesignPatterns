package net.mmiroshnichenko.basepatterns.creational.abstractfactory.mac;

import net.mmiroshnichenko.basepatterns.creational.abstractfactory.Button;
import net.mmiroshnichenko.basepatterns.creational.abstractfactory.CheckBox;
import net.mmiroshnichenko.basepatterns.creational.abstractfactory.GUIFactory;

public class MacGuiFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
