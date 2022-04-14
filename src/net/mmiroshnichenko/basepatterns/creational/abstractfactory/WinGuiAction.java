package net.mmiroshnichenko.basepatterns.creational.abstractfactory;

import net.mmiroshnichenko.basepatterns.creational.abstractfactory.win.WinGuiFactory;

public class WinGuiAction {
    public static void main(String[] args) {
        GUIFactory guiFactory = new WinGuiFactory();
        Button button = guiFactory.createButton();
        CheckBox checkBox = guiFactory.createCheckBox();

        System.out.println("Creating GUI for Windows...");
        button.onClick();
        checkBox.onCheck();
    }
}
