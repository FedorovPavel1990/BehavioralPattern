package main.iterator.place;

public record Place(String name) {

    public void visit() {
        System.out.printf("Посещение достопримечательности %s%n", name);
    }

}
