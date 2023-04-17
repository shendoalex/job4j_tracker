package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder resultString = new StringBuilder();
        int size = evenElements.size();
        for (int index = 0; index < size; index++) {
            if (index % 2 == 0) {
                resultString.append(evenElements.pop());
            } else {
                evenElements.pop();
            }
        }
        return resultString.toString();
    }

    private String getDescendingElements() {
        StringBuilder resultString = new StringBuilder();
        Iterator<Character> iterator = descendingElements.descendingIterator();
        int size = descendingElements.size();
        for (int index = 0; index < size; index++) {
            resultString.append(iterator.next());
        }
        return resultString.toString();
    }

    String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
