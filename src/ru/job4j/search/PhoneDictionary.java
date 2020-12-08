package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private final ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person elem : persons) {
            if (elem.getName().contains(key)) {
                result.add(elem);
            } else if (elem.getSurname().contains(key)) {
                result.add(elem);
            } else if (elem.getPhone().contains(key)) {
                result.add(elem);
            } else if (elem.getAddress().contains(key)) {
                result.add(elem);
            }
        }
        return result;
    }
}