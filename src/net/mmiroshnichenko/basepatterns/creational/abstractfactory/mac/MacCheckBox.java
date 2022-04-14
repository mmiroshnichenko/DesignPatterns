package net.mmiroshnichenko.basepatterns.creational.abstractfactory.mac;

import net.mmiroshnichenko.basepatterns.creational.abstractfactory.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void onCheck() {
        System.out.println("OnCheck MacCheckBox");
    }
}
