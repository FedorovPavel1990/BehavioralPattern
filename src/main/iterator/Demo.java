package main.iterator;

import main.iterator.place.Place;
import main.iterator.place.PlaceIterator;
import main.iterator.place.PlaceIteratorImpl;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Place> romanPlaces = List.of(
                new Place("Колизей"),
                new Place("Ватикан"),
                new Place("Пантеон"),
                new Place("Римский форум"),
                new Place("Фонтан Треви")
        );

        PlaceIterator guide = new PlaceIteratorImpl(romanPlaces);

        visitNextPlace(guide);
        visitNextPlace(guide);
        visitNextPlace(guide);
        visitNextPlace(guide);
        visitNextPlace(guide);
        visitNextPlace(guide);
    }

    private static void visitNextPlace(PlaceIterator guide) {
        if (guide.hasNext()) {
            guide.visitNext();
        } else {
            System.out.println("Маршрут закончен");
        }
    }

}