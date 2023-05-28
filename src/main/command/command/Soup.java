package main.command.command;

import main.command.cook.Cook;

public class Soup extends DishCommand {

    public Soup(Cook cook) {
        super(cook);
    }

    @Override
    public void placeOrder() {
        cook.cooking("Знаменитый болгарский гуляш (бограчгуйяш)");
    }

}
