package main.command;

import main.command.command.DishCommand;
import main.command.command.Meat;
import main.command.command.Soup;
import main.command.cook.Cook;
import main.command.waiter.Waiter;

import java.util.Map;

public class Demo {

    public static void main(String[] args) {
        Cook cook = new Cook();

        Map<String, DishCommand> menu = Map.of(
                "Мясное блюдо дня", new Meat(cook),
                "Суп дня", new Soup(cook)
        );

        Waiter waiter = new Waiter();

        waiter.placeOrder(menu.get("Мясное блюдо дня"));
        waiter.placeOrder(menu.get("Суп дня"));
        waiter.placeOrder(menu.get("Суп дня"));
    }

}