package main.controller;

import main.controller.aircraft.Aircraft;
import main.controller.dispatcher.AirTrafficController;
import main.controller.dispatcher.AirTrafficControllerImpl;

public class Demo {
    public static void main(String[] args) {
        AirTrafficController airTrafficController = new AirTrafficControllerImpl();

        Aircraft passengerAircraft = new Aircraft("11-111");
        Aircraft cargoAircraft = new Aircraft("Cargo-1414");

        airTrafficController.allowForLanding(passengerAircraft);
        airTrafficController.allowForTakeOff(cargoAircraft);
    }
}
