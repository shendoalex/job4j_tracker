package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] array = {"a", "b", "k1ey"};
            int index = indexOf(array, "key");
            if (index == -1) {
                throw new ElementNotFoundException("Element not found");
            } else {
                System.out.println("Element's index is: " + index);
            }
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
