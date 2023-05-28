package main.command.command;

import main.command.cook.Cook;

public class Meat extends DishCommand {

    public Meat(Cook cook) {
        super(cook);
    }

    @Override
    public void placeOrder() {
        cook.cooking("Стейк из австралийской мраморной говядины с чили сальсой");
    }

}
