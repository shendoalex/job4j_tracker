package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return this.items;
    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    public Item findById(int id) {
        Item result = null;
        for (Item item : items) {
            if (item.getId() == id) {
                result = item;
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        item.setId(id);
        boolean result = !(indexOf(id) < 0);
        if (result) {
            this.items.set(indexOf(id), item);
        }
        return result;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (Item item : items) {
            if (item.getId() == id) {
                rsl = items.indexOf(item);
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        Item item = findById(id);
        boolean rsl = !(item == null);
        if (rsl) {
            items.remove(item);
        }
        return rsl;
    }
}