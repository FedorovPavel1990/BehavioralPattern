package main.state;

import main.state.phone.SmartPhone;

public class Demo {

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.tapScreen();
        smartPhone.pressLockButton();
        smartPhone.tapScreen();
        smartPhone.pressLockButton();
        smartPhone.tapScreen();
        smartPhone.pressLockButton();
        smartPhone.tapScreen();
    }

}
