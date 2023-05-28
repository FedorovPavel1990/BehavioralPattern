package main.command.waiter;

import main.command.command.DishCommand;

/**
 * Исполнитель
 */
public class Waiter {

    public void placeOrder(DishCommand dishCommand) {
        dishCommand.placeOrder();
    }

}
