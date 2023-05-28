package main.startegy.tripstrategy;

public class TrainTrip implements TripStrategy {
    @Override
    public void execute() {
        System.out.println("Покупаем билеты на поезд, добираемся до вокзала и едем на поезде");
    }
}
