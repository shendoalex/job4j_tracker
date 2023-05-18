package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> nameContains = t -> t.getName().contains(key);
        Predicate<Person> surnameContains = t -> t.getSurname().contains(key);
        Predicate<Person> addressContains = t -> t.getAddress().contains(key);
        Predicate<Person> phoneContains = t -> t.getPhone().contains(key);
        Predicate<Person> combine = nameContains.or(surnameContains).or(addressContains).or(phoneContains);
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
