package main.command.command;

import main.command.cook.Cook;

public abstract class DishCommand {

    protected final Cook cook;

    protected DishCommand(Cook cook) {
        this.cook = cook;
    }

    public abstract void placeOrder();

}
