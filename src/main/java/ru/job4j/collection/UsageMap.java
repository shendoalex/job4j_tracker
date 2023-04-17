package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("poet1@gmail.com", "Pushkin Alexander Sergeevich");
        map.put("poet2@gmail.com", "Lermontov Mikhail Yurievich");
        map.put("poet3@gmail.com", "Chekhov Anton Pavlovich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
