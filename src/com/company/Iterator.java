package com.company;

public interface Iterator {

    default boolean hasNext() {
        return false;
    }

    default int next() {
        return 0;
    }

}
