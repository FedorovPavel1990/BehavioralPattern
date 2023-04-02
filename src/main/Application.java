package main;

import main.abstractfactory.ProductFactory;
import main.abstractfactory.WoodenProductFactory;
import main.abstractfactory.caretool.CareTool;
import main.abstractfactory.product.Product;
import main.builder.Pizza;
import main.builder.PizzaBuilder;
import main.factorymethod.ServiceStation;
import main.prototype.DoorKey;
import main.singleton.*;

class Application {

    public static void main(String[] args) {
//        testAbstractFactory();
//        testFactoryMethod();
//        testBuilder();
//        testPrototype();
        testSingleton();
    }

    private static void testAbstractFactory() {
        ProductFactory factory = new WoodenProductFactory();

        Product chair = factory.createProduct("Стул");
        CareTool chairCareTool = factory.createCareTool("Средство по уходу за стулом");

        System.out.println(chair);
        System.out.println(chairCareTool);
    }
    private static void testFactoryMethod() {
        new ServiceStation().repairCar( "Volvo А515РО771");
    }

    private static void testBuilder() {
        Pizza smallPepperoniPizza = new PizzaBuilder(21)
                .withPepperoni()
                .withCheese()
                .withBacon()
                .build();

        System.out.println(smallPepperoniPizza);
    }
    private static void testPrototype() {
        DoorKey doorKey = new DoorKey(1, 3, 5, 6, 2, 1, 4);
        DoorKey duplicateDoorKey = doorKey.clone();

        System.out.println(duplicateDoorKey);
    }
    private static void testSingleton() {
        LeftRoad leftRoad = new LeftRoad();
        RightRoad rightRoad = new RightRoad();
        FrontRoad frontRoad = new FrontRoad();
        BackRoad backRoad = new BackRoad();
        PedestrianCrossing pedestrianCrossing = new PedestrianCrossing();

        TrafficController.getInstance().allowMovePedestrians();

        System.out.println(leftRoad);
        System.out.println(rightRoad);
        System.out.println(frontRoad);
        System.out.println(backRoad);
        System.out.println(pedestrianCrossing);
    }

}