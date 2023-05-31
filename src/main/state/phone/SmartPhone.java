package main.state.phone;

import main.state.state.State;

public class SmartPhone {

    private State state = State.Locked;

    public void tapScreen() {
        System.out.printf("Касаемся экрана телефона, телефон показывает %s%n", state.getStateProcessor().onScreenTap(this));
    }

    public void pressLockButton() {
        state.getStateProcessor().onLockButton(this);
        System.out.printf("Нажимаем на кнопку блокировки, %s%n", state);
    }

    public void setState(State state) {
        this.state = state;
    }
}
