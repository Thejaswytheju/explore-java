package com.theja.java.study.explorejava.sort;

import java.util.Collections;
import java.util.List;

public class Sorter<T extends Comparable<? super T>> {

    public void sort(List<T> listToBeSorted) {
        Collections.sort(listToBeSorted);
    }


}
