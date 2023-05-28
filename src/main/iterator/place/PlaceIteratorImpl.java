package main.iterator.place;

import java.util.List;

public class PlaceIteratorImpl implements PlaceIterator {

    private final List<Place> places;

    private int currentPlaceIndex = 0;

    public PlaceIteratorImpl(List<Place> places) {
        this.places = places;
    }

    @Override
    public void visitNext() {
        places.get(currentPlaceIndex).visit();
        currentPlaceIndex++;
    }

    @Override
    public boolean hasNext() {
        return currentPlaceIndex < places.size();
    }
}
