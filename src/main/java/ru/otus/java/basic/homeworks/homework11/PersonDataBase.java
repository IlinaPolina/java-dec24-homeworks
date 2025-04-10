package ru.otus.java.basic.homeworks.homework11;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {
    private Map<Long, Person> personMap;

    public PersonDataBase() {
        this.personMap = new HashMap<>();
    }

    public void add(Person person) {
        personMap.put(person.id, person);
    }

    public Person findById(Long id) {
        return personMap.get(id);
    }

    public boolean isManager(Person person) {
        Position pos = person.position;
        return pos == Position.MANAGER ||
                pos == Position.DIRECTOR ||
                pos == Position.BRANCH_DIRECTOR ||
                pos == Position.SENIOR_MANAGER;
    }

    public boolean isEmployee(Long id) {
        Person person = personMap.get(id);
        if (person == null) return false;

        Position pos = person.position;
        return pos != Position.MANAGER &&
                pos != Position.DIRECTOR &&
                pos != Position.BRANCH_DIRECTOR &&
                pos != Position.SENIOR_MANAGER;
    }
}
