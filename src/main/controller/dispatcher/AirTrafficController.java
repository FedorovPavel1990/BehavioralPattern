package main.controller.dispatcher;

import main.controller.aircraft.Aircraft;

public interface AirTrafficController {

    void allowForTakeOff(Aircraft aircraft);

    void allowForLanding(Aircraft aircraft);

}
