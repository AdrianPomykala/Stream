package com.sda.person;

import java.util.List;

public class Programmer {
    private Person person;
    private List<String> languages;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "person=" + person +
                ", languages=" + languages +
                '}';
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public Programmer(Person person, List<String> jezyki) {

        this.person = person;
        this.languages = jezyki;
    }
}
