package com.epam.algorithms.alphabets;

import java.util.Set;
import java.util.function.Function;

public interface Enumerable<T, R> {

    void calculateAlphabet(T[] data, Function<T, R> splitter);

    void createAlphabetFromSet(Set<T> alphabet);

    void setAlphabet(Enum alphabet);

    int getKey(T value);

}
