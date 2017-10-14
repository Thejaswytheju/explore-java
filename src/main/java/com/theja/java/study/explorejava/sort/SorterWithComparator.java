package com.theja.java.study.explorejava.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SorterWithComparator<T, CT extends Comparator<? super T>> {

    public void sort(List<T> listTobeSorted, CT comparator) {
        Collections.sort(listTobeSorted, comparator);
    }

}
