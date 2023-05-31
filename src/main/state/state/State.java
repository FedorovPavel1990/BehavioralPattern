package main.state.state;

public enum State {

    Locked(new LockedState()),
    Unlocked(new UnlockedState());

    private final StateInterface stateProcessor;

    State(StateInterface stateProcessor) {
        this.stateProcessor = stateProcessor;
    }

    public StateInterface getStateProcessor() {
        return stateProcessor;
    }

}
