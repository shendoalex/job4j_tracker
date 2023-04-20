package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        Integer leftNumber = Integer.parseInt(left.split("\\.")[0]);
        Integer rightNumber = Integer.parseInt(right.split("\\.")[0]);
        return leftNumber.compareTo(rightNumber);
    }
}