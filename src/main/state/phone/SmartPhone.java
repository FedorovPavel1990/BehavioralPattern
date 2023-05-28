package main.state.phone;

import main.state.state.LockedState;
import main.state.state.State;

public class SmartPhone {

    private State state = new LockedState(this);

    public void tapScreen() {
        System.out.printf("Касаемся экрана телефона, телефон показывает %s%n", state.onScreenTap());
    }

    public void pressLockButton() {
        state.onLockButton();
        System.out.printf("Нажимаем на кнопку блокировки, %s%n", state);
    }

    public void setState(State state) {
        this.state = state;
    }
}
