package main.state.state;

import main.state.phone.SmartPhone;

public class UnlockedState extends State {

    public UnlockedState(SmartPhone smartPhone) {
        super(smartPhone);
    }

    @Override
    public String onScreenTap() {
        return "Рабочий стол";
    }

    @Override
    public void onLockButton() {
        smartPhone.setState(new LockedState(smartPhone));
    }

    @Override
    public String toString() {
        return "Телефон разблокирован";
    }
}
