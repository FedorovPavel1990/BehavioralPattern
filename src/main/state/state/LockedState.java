package main.state.state;

import main.state.phone.SmartPhone;

public class LockedState extends State {

    public LockedState(SmartPhone smartPhone) {
        super(smartPhone);
    }

    @Override
    public String onScreenTap() {
        return "Экран блокировки";
    }

    @Override
    public void onLockButton() {
        smartPhone.setState(new UnlockedState(smartPhone));
    }

    @Override
    public String toString() {
        return "Телефон заблокирован";
    }
}
