package main.controller.dispatcher;

import main.controller.aircraft.Aircraft;

public class AirTrafficControllerImpl implements AirTrafficController {


    @Override
    public void allowForTakeOff(Aircraft aircraft) {
        System.out.printf("Авиадиспетчер: Разрешаю взлет для рейса %s%n", aircraft.flightNumber());
        aircraft.takingOff();
    }

    @Override
    public void allowForLanding(Aircraft aircraft) {
        System.out.printf("Авиадиспетчер: Разрешаю посадку для рейса %s%n", aircraft.flightNumber());
        aircraft.landing();
    }
}