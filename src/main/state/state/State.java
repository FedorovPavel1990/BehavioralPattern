package main.state.state;

import main.state.phone.SmartPhone;

public enum State {

    Locked(new LockedState()),
    Unlocked(new UnlockedState());

    private final StateInterface state;

    State(StateInterface state) {
        this.state = state;
    }

    public String onScreenTap(SmartPhone smartPhone) {
       return state.onScreenTap(smartPhone);
    }

    public void onLockButton(SmartPhone smartPhone) {
        state.onLockButton(smartPhone);
    }
}
