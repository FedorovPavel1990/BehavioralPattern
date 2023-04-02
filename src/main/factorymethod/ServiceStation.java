package main.factorymethod;

import main.factorymethod.carproblem.CarBody;
import main.factorymethod.carproblem.CarProblem;
import main.factorymethod.carproblem.Electrics;
import main.factorymethod.carproblem.Suspension;

import java.util.List;
import java.util.Random;

public class ServiceStation {

    public void repairCar(String car) {
        CarProblem carProblem = diagnosticsCar(car);
        carProblem.fix();
    }

    private CarProblem diagnosticsCar(String car) {
        CarProblem carProblem = List.of(new Electrics(), new Suspension(), new CarBody()).get(new Random().nextInt(3));
        System.out.printf("Проблемная часть машины %s - %s%n", car, carProblem);
        return carProblem;
    }

}