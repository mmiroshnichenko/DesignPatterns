package net.mmiroshnichenko.basepatterns.creational.abstractfactory;

import net.mmiroshnichenko.basepatterns.creational.abstractfactory.mac.MacGuiFactory;

public class MacGuiAction {
    public static void main(String[] args) {
        GUIFactory guiFactory = new MacGuiFactory();
        Button button = guiFactory.createButton();
        CheckBox checkBox = guiFactory.createCheckBox();

        System.out.println("Creating GUI for Mac...");
        button.onClick();
        checkBox.onCheck();
    }
}
