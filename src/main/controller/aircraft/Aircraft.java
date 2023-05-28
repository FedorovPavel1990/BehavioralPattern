package main.controller.aircraft;

public record Aircraft(String flightNumber) {

    public void takingOff() {
        System.out.printf("Рейс %s: пошел на взлет%n", flightNumber);
    }

    public void landing() {
        System.out.printf("Рейс %s: пошел на посадку%n", flightNumber);
    }
}
