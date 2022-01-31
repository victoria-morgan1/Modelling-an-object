package application;

import model.PersonDirector;

public class Main {
    public static void main(String[] args) {
        PersonDirector person = new PersonDirector("Miss", "Vic", "Mrg", "Vikki",
                "Wales", "welsh", "Jan", "Director");
        System.out.println(person.toString());
        System.out.println(person.getTitle());
        person.setTitle("Mrs");
        System.out.println(person.toString());
    }
}
