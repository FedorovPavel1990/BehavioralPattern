package main.state.state;

import main.state.phone.SmartPhone;

public abstract class State {

    protected final SmartPhone smartPhone;

    protected State(SmartPhone smartPhone) {
        this.smartPhone = smartPhone;
    }

    public abstract String onScreenTap();

    public abstract void onLockButton();

}
