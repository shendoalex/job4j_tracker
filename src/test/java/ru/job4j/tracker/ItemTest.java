package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemTest {
    @Test
    public void whenItemAscByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("BugC"));
        items.add(new Item("BugB"));
        items.add(new Item("BugA"));
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item("BugA"));
        expected.add(new Item("BugB"));
        expected.add(new Item("BugC"));
        Assert.assertEquals(items, expected);
    }

    @Test
    public void whenItemDescByName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("BugC"));
        items.add(new Item("BugA"));
        items.add(new Item("BugB"));
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item("BugC"));
        expected.add(new Item("BugB"));
        expected.add(new Item("BugA"));
        Assert.assertEquals(items, expected);
    }
}