package main.startegy.trip;

import main.startegy.tripstrategy.TripStrategy;

public class Trip {

    TripStrategy tripStrategy;

    public void setTripStrategy(TripStrategy tripStrategy) {
        this.tripStrategy = tripStrategy;
    }

    public void go() {
        tripStrategy.execute();
    }

}
