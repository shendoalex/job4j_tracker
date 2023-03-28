package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime local = item.getLocalDateTime();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String localFormatted = local.format(format);
        System.out.println(localFormatted);
    }
}
