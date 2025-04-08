package ru.otus.java.basic.homeworks.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> contacts = new HashMap<>();

    public void add (String name, String phoneNumber) {
        if (name == null || phoneNumber == null) {
            throw new IllegalArgumentException("Имя и номер телефона не должны быть null");
        }
        if (contacts.containsKey(name)) {
            contacts.get(name).add(phoneNumber);
        }
        else {
            List<String> phones = new ArrayList<>();
            phones.add(phoneNumber);
            contacts.put(name, phones);
        }

    }
    public List<String> find(String name) {
        return contacts.getOrDefault(name, new ArrayList<>());
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (List<String> phones : contacts.values()) {
            if (phones.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}
