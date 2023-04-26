package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] a = o1.split("/", 2);
        String[] b = o2.split("/", 2);
        int compare = b[0].compareTo(a[0]);
        return compare == 0 ? o1.compareTo(o2) : compare;
    }
}