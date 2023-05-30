package main.state.state;

import main.state.phone.SmartPhone;

public class LockedState implements StateInterface {

    @Override
    public String onScreenTap(SmartPhone smartPhone) {
        return "Экран блокировки";
    }

    @Override
    public void onLockButton(SmartPhone smartPhone) {
        smartPhone.setState(State.Unlocked);
    }

}
