package ru.geekbrains.lessons;

import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    HashMap<String, HashSet<String>> pb;

    public Phonebook() {
        this.pb = new HashMap<>();
    }

    public void addContact(String name, String number) {
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(number);
        pb.put(name, book);
    }

    public void findAndPrintContact(String name) {
        System.out.println("Contact " + name + " - Phone number " + pb.getOrDefault(name, new HashSet<>()));
    }
}
