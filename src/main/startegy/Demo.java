package main.startegy;

import main.startegy.trip.Trip;
import main.startegy.tripstrategy.CarTrip;
import main.startegy.tripstrategy.PlaneTrip;
import main.startegy.tripstrategy.TrainTrip;

public class Demo {

    public static void main(String[] args) {
        Trip trip = new Trip();
        trip.setTripStrategy(new PlaneTrip());
        trip.go();
        trip.setTripStrategy(new CarTrip());
        trip.go();
        trip.setTripStrategy(new TrainTrip());
        trip.go();
    }

}
