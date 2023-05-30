package main.state.state;

import main.state.phone.SmartPhone;

public class UnlockedState implements StateInterface {

    @Override
    public String onScreenTap(SmartPhone smartPhone) {
        return "Рабочий стол";
    }

    @Override
    public void onLockButton(SmartPhone smartPhone) {
        smartPhone.setState(State.Locked);
    }

}
