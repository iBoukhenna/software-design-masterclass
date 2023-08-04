package com.example.iterator;

import java.util.Iterator;

public class BikeIterator implements Iterator<String> {
	private String [] bikes;
    private int currentIndex = 0;

    public BikeIterator(String [] bikes) {
        this.bikes = bikes;
    }
			
    @Override
    public boolean hasNext() {
        return currentIndex < bikes.length && bikes[currentIndex] != null;
    }

    @Override
    public String next() {
        return bikes[currentIndex++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
