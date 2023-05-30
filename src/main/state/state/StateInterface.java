package main.state.state;

import main.state.phone.SmartPhone;

public interface StateInterface {

    String onScreenTap(SmartPhone smartPhone);

    void onLockButton(SmartPhone smartPhone);

}
