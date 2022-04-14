package net.mmiroshnichenko.basepatterns.creational.abstractfactory.win;

import net.mmiroshnichenko.basepatterns.creational.abstractfactory.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void onCheck() {
        System.out.println("OnCheck WinCheckBox");
    }
}
